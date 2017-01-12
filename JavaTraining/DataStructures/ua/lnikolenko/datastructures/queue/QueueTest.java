package ua.lnikolenko.datastructures.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new ArrayQueue();
        queue.push("A");
        queue.push("B");
        queue.push("C");
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());

    }
}
