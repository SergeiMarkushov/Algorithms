package ru.markush.newLessons.code.stackAndQueue.stack;

public interface Stack<E> {
    boolean push(E value);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
    boolean isFull();
    void display();
}
