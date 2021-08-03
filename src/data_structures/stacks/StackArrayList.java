package data_structures.stacks;

import java.util.ArrayList;

// Stack implemented in ArrayList
public class StackArrayList implements Stack {
    private ArrayList<E> arrayList = new ArrayList<E>();

    @Override
    public boolean isEmpty() { //Returns true if the stack contains no elements
        if (arrayList.size() == 0) return true;

        return false;
    }

    @Override
    public E peek() { //Returns the element at the top of the stack
        if(isEmpty()) return null;

        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public void push(E element) { //Inserts the specified element onto the top of the stack
        arrayList.add(element);
    }

    @Override
    public E pop() { //Removes and returns the element at the top of the stack
        if(isEmpty()) return null;

        arrayList.remove(arrayList.size()-1);

        return peek();
    }
}
