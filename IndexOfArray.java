package com.exampleJava;

/**
 * Practical 19 : Program to find an index of an array
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class IndexOfArray {

    public static int findIndex(int array[], int t) {
        if (array == null) { // If array is Null
            return -1;
        }
        int len = array.length; // Find length of array
        int i = 0;

        while (i < len) { // Traverse in the array
            if (array[i] == t) { // if the i-th element is t
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {44, 22, 11, 33, 55, 77, 66, 54, 67};
        System.out.println("Index position of 33 is: " + findIndex(myArray, 33));
        System.out.println("Index position of 66 is: " + findIndex(myArray, 66));
    }

}