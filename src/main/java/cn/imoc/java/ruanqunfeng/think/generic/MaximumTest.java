package cn.imoc.java.ruanqunfeng.think.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaximumTest {
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if ( y.compareTo( max ) > 0 ) {
            max = y; // y is the largest so far
        }
        if ( z.compareTo( max ) > 0 ) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    private static <T> void addGeneric(T element, List<T> list) {
        list.add(element);
    }

    public static void main(String args[])  {
        System.out.printf( "Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );

        List<java.util.Date> dateList = new ArrayList<Date>();
        Serializable s = new String();
        //addGeneric(s, dateList);
    }
}