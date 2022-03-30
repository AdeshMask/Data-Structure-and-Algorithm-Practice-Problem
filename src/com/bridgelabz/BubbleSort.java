package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bubble Sort");
        System.out.println("Enter Lenght of array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter Array elements::");
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        Sorting sorting = new Sorting();
        System.out.println("Before Sorting: ");
        sorting.bubblePrint(arr ,n);
        System.out.println();
        sorting.bubbleSort(arr,n);
        System.out.println("After sorting: ");
        sorting.bubblePrint(arr,n);
    }
}
