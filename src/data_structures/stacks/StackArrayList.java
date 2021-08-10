package data_structures.stacks;

import java.util.ArrayList;

// Stack implemented in ArrayList
public class StackArrayList implements Stack {
    private ArrayList<E> stack = new ArrayList<E>();

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

        return stack.get(stack.size()-1);
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        stack.add(element);
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        stack.remove(stack.size()-1);

        return peek();
    }
}
