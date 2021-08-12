package data_structures.linked_lists;

public interface List {
    public boolean isEmpty();

    public int size();

    public void append(E element);

    public void prepend(E element);

    public void insert(int index, E element);

    public E getFirst();

    public E getLast();

    public E get(int index);

    public int find(E element);

    public E removeFirst();

    public E removeLast();

    public E remove(int index);

    public boolean remove(E element);
}
