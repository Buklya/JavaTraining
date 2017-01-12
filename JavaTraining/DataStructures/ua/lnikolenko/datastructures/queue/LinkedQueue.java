package ua.lnikolenko.datastructures.queue;

public class LinkedQueue implements Queue {
    int size;
    Node head;
    Node last;

    @Override
    public void push(Object value) {
        if(size == 0){
            head = new Node(value);
            last = head;
        }else{
            last.next = new Node(value);
            last = last.next;
        }
        size ++;
    }

    @Override
    public Object pop() {
        if (size == 0) {
            throw new NullPointerException("Queue is empty");
        }
        Object value = head.value;
        head = head.next;
        size--;
        return value;
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new NullPointerException("Queue is empty");
        }
        return head.value;
    }
}
