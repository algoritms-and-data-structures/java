package data_structures.queue;

import java.util.Arrays;

public class QueueArray implements Queue {
    private E[] queue;
    private int size;

    public QueueArray() {
        queue = new E[10];
        size = 0;
    }

    @Override
    public boolean isEmpty() { // Returns true if the queue contains no elements
        if (size == 0) return true;

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() { // Returns the element at the front of the queue.
        if(isEmpty()) return null;

        return queue[0];
    }

    @Override
    public void enqueue(E element) {  // Inserts the specified element at the rear of the queue
        if(size == queue.length) increaseSize();

        queue[size] = element;
        size++;
    }

    @Override
    public E dequeue() { // Removes and returns the element at the front of the queue
        if(isEmpty()) return null;

        queue[0] = null;

        for(int i = 1; i < size; i++) {
            queue[i-1] = queue[i];
        }
        
        queue[size-1] = null;
        size--;

        return peek();
    }

    private void increaseSize() {
        int newSize = queue.length * 2;
        queue = Arrays.copyOf(queue, newSize);
    }
}
