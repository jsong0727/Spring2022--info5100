package edu.northeastern.jiayin;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.add("Jiayin");
        queue.add("Weihua");
        queue.add("Yun");
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
//        queue.remove();
        System.out.println(queue.isEmpty());

    }
}
