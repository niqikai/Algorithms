package edu.encu.sorting;

public class MergeSort {

    public static boolean less (Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    public static void merge (Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid+1;

        for (int k = lo; k <= hi; k++) {
            if ( i > mid ) {
                a[k] = aux[j++];
            } else if ( j > hi ) {
                a[k] = aux[j++];
            } else if ( less(aux[j], aux[i]) ) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }

        }
    }

}
