package data_structures.queue;

import java.util.Vector;

public class QueueVector implements Queue {
    private Vector<E> queue;

    public QueueVector() {
        queue = new Vector<E>();
    }

    @Override
    public boolean isEmpty() { // Returns true if the queue contains no elements
        if(queue.size() == 0) return true;

        return false;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public E peek() { // Returns the element at the front of the queue.
        if(isEmpty()) return null;

        return queue.elementAt(0);
    }

    @Override
    public void enqueue(E element) { // Inserts the specified element at the rear of the queue
        queue.add(element);
        queue.trimToSize();
    }

    @Override
    public E dequeue() { // Removes and returns the element at the front of the queue
        if(isEmpty()) return null;

        queue.removeElementAt(0);

        return peek();
    }
}
