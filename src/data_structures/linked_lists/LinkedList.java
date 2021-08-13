package data_structures.linked_lists;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public boolean isEmpty() { // Returns true if the list contains no elements
        if (length == 0) return true;

        return false;
    }

    @Override
    public int size() { // Returns the number of elements in the list
        return length;
    }

    @Override
    public void append(E element) { // Inserts the element at the last position in the list
        Node newNode = new Node(element);

        tail.next = newNode;
        tail = newNode;
        length++;
    }

    @Override
    public void prepend(E element) { // Inserts the element at the first position in the list
        Node newNode = new Node(element);

        newNode.next = head;
        head = newNode;
        length++;
    }

    @Override
    public void insert(int index, E element) { // Inserts the element at the specified position
        if (index <= 0) {
            prepend(element);
            return;
        }

        if (index >= length || isEmpty()) {
            append(element);
            return;
        }

        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        Node newNode = new Node(element);
        newNode.next = node.next;
        node.next = newNode;

        length++;
    }

    @Override
    public E getFirst() { // Returns the first element of the list
        if (isEmpty()) return null;

        return head.element;
    }

    @Override
    public E getLast() { // Returns the last element of the list
        if (isEmpty()) return null;

        return tail.element;
    }

    @Override
    public E get(int index) { // Returns the element at the specified position in the list
        if (isEmpty()) return null;

        if (index >= length) {
            System.out.println("Cannot get: Index is larger than length");
            return null;
        }

        if (index == 0) return getFirst();

        if (index == length - 1) return getLast();

        Node tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.element;
    }

    // Returns the position of the first occurrence of the element
    // or returns -1 if the list is empty or the element is not in the list
    @Override
    public int find(E element) {
        if (isEmpty()) return -1;

        Node tempNode = head;
        for (int i = 0; i < length; i++) {
            if (tempNode.element == element) return i;

            tempNode = tempNode.next;
        }

        return -1;
    }

    @Override
    public E removeFirst() { // Removes and returns the element at the first position in the list
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }

        head = head.next;
        length--;
        return getFirst();
    }

    @Override
    public E removeLast() { // Removes and returns the element at the last position in the list
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }

        Node newTail = head;
        for (int i = 0; i < length - 2; i++) {
            newTail = newTail.next;
        }

        newTail.next = tail.next;
        tail = newTail;

        length--;
        return getLast();
    }

    @Override
    public E remove(int index) { // Removes and returns the element at the specified position in the list
        if (isEmpty()) {
            System.out.println("List in Empty");
            return null;
        }

        if (index >= length) {
            System.out.println("Cannot remove: Index larger than length");
            return null;
        }

        if (index == 0) return removeFirst();

        if (index == length - 1) return removeLast();

        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }

        Node aux = node.next;
        node.next = aux.next;

        length--;
        return get(index);
    }

    // Removes the first occurrence of the element and returns true,
    // or false if the list in empty or the element is not in the list
    @Override
    public boolean remove(E element) {
        if (isEmpty()) {
            System.out.println("List in Empty");
            return false;
        }

        if (head.element == element) {
            removeFirst();
            return true;
        }

        Node tempNode = head;
        Node aux;
        for (int i = 0; i < length - 1; i++) {
            if (tempNode.next.element == element) {
                aux = tempNode.next;
                tempNode.next = aux.next;

                length--;
                return true;
            }

            tempNode = tempNode.next;
        }

        return false;
    }

    private class Node {
        E element;
        Node next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

}