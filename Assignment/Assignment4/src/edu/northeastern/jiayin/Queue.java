package edu.northeastern.jiayin;

import java.util.Stack;

public class Queue<T> {

    Stack<T> s1;

    Queue() {
        s1 = new Stack<>();
    }

    //add(T data)
    public void add(T data) {
        synchronized (s1) {
            s1.push(data);
        }
    }

    //T remove()
    public T remove() {
        synchronized (s1) {
            return s1.pop();
        }
    }

    //T peek()
    public T peek() {
        synchronized (s1) {
            return s1.peek();
        }
    }

    //boolean isEmpty()
    public boolean isEmpty() {
        synchronized (s1) {
            return s1.isEmpty();
        }
    }


}
