package ru.markush.old.yandex;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<DataCenter> dataCenters = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                DataCenter dataCenter = new DataCenter();
                dataCenter.setNumberOfCenter(i);
                dataCenters.add(dataCenter);
                addServers(dataCenter, m);
            }

            for (int i = 0; i < q; i++) {
                String command = sc.nextLine();
                if (command.startsWith("DISABLE")) {
                    int dataCenter = Integer.parseInt(command.substring(8, 9));
                    int server = Integer.parseInt(command.substring(10, 11));
                    for (DataCenter center : dataCenters) {
                        if (center.getNumberOfCenter() == dataCenter) {
                            for (Server centerServer : center.getServers()) {
                                if (server == centerServer.getNumberOfServer()) {
                                    centerServer.setActive(false);
                                    center.recalculate();
                                }
                            }
                        }
                    }
                }
                if (command.startsWith("GETMAX")) {
                    getMax(dataCenters);
                    System.out.println();
                }
                if (command.startsWith("GETMIN")) {
                    getMin(dataCenters);
                    System.out.println();
                }
                if (command.startsWith("RESET")) {
                    int idCenter = Integer.parseInt(command.substring(6, 7));
                    for (DataCenter dataCenter : dataCenters) {
                        if (idCenter == dataCenter.getNumberOfCenter()) {
                            dataCenter.reset();
                        }
                    }
                }
            }

        }
    }

    public static void addServers(DataCenter dataCenter, int m) {
        for (int i = 1; i <= m; i++) {
            Server server = new Server();
            server.setNumberOfServer(i);
            dataCenter.getServers().add(server);
        }
        dataCenter.initServers();
    }

    public static void getMax(List<DataCenter> dataCenters) {
        int max = 0;
        int idCenter = 0;
        for (DataCenter dataCenter : dataCenters) {
            if (max < dataCenter.getMulti()) {
                max = dataCenter.getMulti();
                idCenter = dataCenter.getNumberOfCenter();
            }
        }
        System.out.print(idCenter);
    }


    public static void getMin(List<DataCenter> dataCenters) {
        int min = dataCenters.size();
        int idCenter = 0;
        for (DataCenter dataCenter : dataCenters) {
            if (min > dataCenter.getMulti()) {
                min = dataCenter.getMulti();
                idCenter = dataCenter.getNumberOfCenter();
            }
        }
        System.out.print(idCenter);
    }
}


class DataCenter {
    private final List<Server> servers = new ArrayList<>();
    private int numberOfCenter;
    private int resets;
    private int workingServers;

    public void initServers() {
        this.workingServers = this.servers.size();
    }

    public void recalculate() {
        workingServers = this.servers.size();
        for (Server server : this.servers) {
            if (!server.isActive()) {
                workingServers--;
            }
        }
    }

    public List<Server> getServers() {
        return servers;
    }

    public void reset() {
        this.resets += 1;
        for (Server server : this.servers) {
            server.setActive(true);
        }
    }

    public int getNumberOfCenter() {
        return numberOfCenter;
    }

    public void setNumberOfCenter(int numberOfCenter) {
        this.numberOfCenter = numberOfCenter;
    }

    public int getMulti() {
        if (resets == 0) {
            return workingServers;
        } else {
            return workingServers * resets;
        }
    }
}

class Server {
    private boolean isActive = true;
    private int numberOfServer;

    public int getNumberOfServer() {
        return numberOfServer;
    }

    public void setNumberOfServer(int numberOfServer) {
        this.numberOfServer = numberOfServer;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}