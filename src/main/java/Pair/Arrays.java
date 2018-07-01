package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {

//    public static <?> Pair<T> firstLast(ArrayList<?> a) {
//    }

    public static <T extends Comparable> Pair<T> firstLast( ArrayList<T> al) {

        return new  Pair<>( al.get(0),  al.get(al.size()-1));
    }

    public static <T extends Comparable> T min(ArrayList<T> al) {
        T min = al.get(0);
        for(T t : al)
            min = ( t.compareTo(min) < 0)? t : min;
        return min;
    }

    public static <T extends Comparable> T max(ArrayList<T> al) {
        T max = al.get(0);
        for(T t : al)
            max = ( t.compareTo(max) > 0)? t : max;
        return max;
    }

    public static <T extends Comparable> Pair <T> minMax(ArrayList<T> al) {
        T min = al.get(0);
        T max = al.get(0);
        for(T t : al) {
            min = (t.compareTo(min) > 0) ? t : min;
            max = (t.compareTo(max) < 0) ? t : max;
        }
        return new Pair<T>(min, max);
    }

}
