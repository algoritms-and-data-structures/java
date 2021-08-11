package data_structures.stacks;

import java.util.Vector;

// Stack implemented in Vector
public class StackVector implements Stack {
    private Vector<E> stack;

    public StackVector() {
        stack = new Vector();
    }

    @Override
    public boolean isEmpty() { //Returns true if the stack contains no elements
        if (stack.size() == 0) return true;

        return false;
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public E peek() { //Returns the element at the top of the stack
        if(isEmpty()) return null;

        return stack.elementAt(stack.size()-1);
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        stack.add(element);
        stack.trimToSize();
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        stack.removeElementAt(stack.size()-1);

        return peek();
    }
}
