package com.Questions;

import java.util.Scanner;

public class Fabonnaci {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, fab;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Series : ");
        System.out.print(f0 + " " + f1 + " ");
        for (int i = 0; i < n; i++) {
            fab = f0 + f1;
            f0 = f1;
            f1 = fab;
            if(fab >= n) break;
            System.out.print(fab + " ");
        }
    }
}