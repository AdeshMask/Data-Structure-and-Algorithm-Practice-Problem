package com.bridgelabz;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str;
        System.out.println("Enter String caculate its Permutations: ");
        str = scanner.nextLine();
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permute(str, 0, n-1);
        }
}
