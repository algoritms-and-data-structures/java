package data_structures.stacks;

import java.util.Arrays;

// Stack implemented in Array
public class StackArray implements Stack {
    private E[] array = new E[10];
    private int size = 0;

    @Override
    public boolean isEmpty() { //Returns true if the stack contains no elements
        if (size == 0) return true;

        return false;
    }

    @Override
    public E peek() { //Returns the element at the top of the stack
        if(isEmpty()) return null;

        return array[size-1];
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        if(size == array.length) increaseSize();

        array[size] = element;
        size++;
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        array[size-1] = null;
        size--;

        return peek();
    }

    private void increaseSize() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
}
