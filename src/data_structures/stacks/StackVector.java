package data_structures.stacks;

import java.util.Vector;

// Stack implemented in Vector
public class StackVector implements Stack {
    private Vector<E> vector = new Vector();

    @Override
    public boolean isEmpty() { //Returns true if the stack contains no elements
        if (vector.size() == 0) return true;

        return false;
    }

    @Override
    public E peek() { //Returns the element at the top of the stack
        if(isEmpty()) return null;

        return vector.elementAt(vector.size()-1);
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        vector.add(element);
        vector.trimToSize();
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        vector.removeElementAt(vector.size()-1);

        return peek();
    }
}
