package edu.encu.sorting;

import edu.princeton.cs.algs4.StdOut;

abstract class AbstractExample {

    abstract void sort( Comparable[] a );

    static boolean less ( Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    static void show( Comparable[] a) {
        for ( Comparable i: a) {
            StdOut.print(i + " ");
        }
        StdOut.println();
    }

    static boolean isSorted( Comparable[] a) {
        for ( int i = 1; i < a.length; i++) {
            if ( less ( a[i], a[i-1]) )
                return false;
        }
        return true;
    }

}
