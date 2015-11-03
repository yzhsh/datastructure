package com.jwetherell.datastructure.sorts;

public class BubbleSort<T extends Comparable<T>> {
    
    private BubbleSort() { }
    
    public static <T extends Comparable<T>> T[] sort(T[] unsorted) {
        boolean swapped = true;
        int length = unsorted.length;
        while (swapped) {
            swapped = false;
            for (int i=1; i<length; i++) {
                if (unsorted[i].compareTo(unsorted[i-1])<0) {
                    swap(i,i-1,unsorted);
                    swapped = true;
                }
            }
            length--;
        }
        
        return unsorted;
    }
    
    private static <T extends Comparable<T>> void swap(int index1, int index2, T[] unsorted) {
        T value = unsorted[index1];
        unsorted[index1] = unsorted[index2];
        unsorted[index2] = value;
    }
}