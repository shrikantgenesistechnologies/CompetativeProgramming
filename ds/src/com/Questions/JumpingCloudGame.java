package com.Questions;

import java.util.Scanner;

public class JumpingCloudGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("Enter array elements with single-seperated space: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int jump = -1;
        for (int i = 0; i < size; i++, jump++) {
            if (i<size-2 && a[i+2]==0) i++;
        }
        System.out.println("Jumps: " + jump);
    }
}
