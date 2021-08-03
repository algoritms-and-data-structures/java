package data_structures.stacks;

public interface Stack {

    public boolean isEmpty();

//    public int size();

    public E peek();

    public void push(E element);

    public E pop();
}
