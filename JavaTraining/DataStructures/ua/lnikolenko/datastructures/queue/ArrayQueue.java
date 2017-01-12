package ua.lnikolenko.datastructures.queue;

public class ArrayQueue implements Queue{
    static final int INITIAL_CAPACITY = 10;
    int size;
    Object[] array = new Object[INITIAL_CAPACITY];
    int start;
    int end;

    @Override
    public void push(Object value) {
        if(size == INITIAL_CAPACITY){
            throw new NullPointerException("Queue is full");
        }
        if(size == 0){
            array[start] = value;
            end++;
            size++;
        }else if(end < INITIAL_CAPACITY){
            array[end] = value;
            end++;
            size++;
        }else if(end == INITIAL_CAPACITY && size < INITIAL_CAPACITY){
            Object[]tempArray = new Object[INITIAL_CAPACITY];
            for(int i = 0; start <= end; i++){
                tempArray[i] = array[start];
            }
            array = tempArray;
            array[end] = value;
            end++;
            size++;
        }
    }

    @Override
    public Object pop() {
        if (size == 0){
            throw new NullPointerException("Queue is empty");
        }        
        Object value = array[start];        
        size--;
        if(start == end){
            start = 0;
            end = 0;
        }else{
            start++;
        }
        return value;
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new NullPointerException("Queue is empty");
        }
        return array[start];
    }
}

