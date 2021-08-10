package data_structures.queue;

public interface Queue {

    public boolean isEmpty();

    public int size();

    public E peek();

    public void enqueue(E element);

    public E dequeue();
}
