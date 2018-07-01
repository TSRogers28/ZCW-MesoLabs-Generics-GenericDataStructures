package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(E foobar) {
        elements.add(foobar);
    }

    public E pop() throws IndexOutOfBoundsException{

       return (E) elements.remove(elements.size()-1);

    }
}
