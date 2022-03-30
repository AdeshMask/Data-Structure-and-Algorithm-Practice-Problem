package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        String[] words = {"Sohan","Kiran","Saurabh","Adesh","Sneha","Ganesh"};
        int n = words.length;
        Sorting sorting = new Sorting();
        sorting.sort(words , n);
        sorting.print(words, n);

    }
}
