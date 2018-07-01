package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable> {
    E t;
    E r;


    public Pair(E t, E r){
        this.t = t;
        this.r = r;
    }

    public E getFirst() {
        return this.t;
    }

    public E getSecond() {
        return this.r;
    }

    public E min() {
        return (t.compareTo(r) < 0) ? t : r;
    }

    public E max() {
        return (t.compareTo(r) > 0) ? t : r;
    }
}
