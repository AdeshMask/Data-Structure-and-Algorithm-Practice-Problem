package com.bridgelabz;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter 2nd String:");
        String str2 = scanner.nextLine();
        Sorting sorting = new Sorting();
        sorting.isangram(str1,str2);
    }
}
