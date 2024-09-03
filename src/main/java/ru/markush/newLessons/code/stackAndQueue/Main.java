package ru.markush.newLessons.code.stackAndQueue;


import ru.markush.newLessons.code.stackAndQueue.queue.Queue;
import ru.markush.newLessons.code.stackAndQueue.queue.QueueImpl;
import ru.markush.newLessons.code.stackAndQueue.stack.Stack;
import ru.markush.newLessons.code.stackAndQueue.stack.StackImpl;

public class Main {
    public static void main(String[] args) {
//        testStack();
        testQueue();
    }
    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(4);

        System.out.println(stack.push(12));
        System.out.println(stack.push(16));
        System.out.println(stack.push(22));
        System.out.println(stack.push(5));
        System.out.println(stack.push(1));
        System.out.println(stack.push(32));

        stack.display();

        System.out.println("top value: " + stack.pop());
        System.out.println("top value: " + stack.peek());
        stack.display();
    }

    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(4);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(28));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();

        System.out.println("remove: " + queue.remove());
        queue.display();
    }
}
