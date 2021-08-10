package data_structures.stacks;

import java.util.Arrays;

// Stack implemented in Array
public class StackArray implements Stack {
    private E[] stack = new E[10];
    private int size = 0;

    @Override
    public boolean isEmpty() { //Returns true if the stack contains no elements
        if (size == 0) return true;

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() { //Returns the element at the top of the stack
        if(isEmpty()) return null;

        return stack[size-1];
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        if(size == stack.length) increaseSize();

        stack[size] = element;
        size++;
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        stack[size-1] = null;
        size--;

        return peek();
    }

    private void increaseSize() {
        int newSize = stack.length * 2;
        stack = Arrays.copyOf(stack, newSize);
    }
}
