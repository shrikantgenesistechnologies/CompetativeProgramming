package com.Questions;
import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = -63;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i + 1][j + 1];
                for (int k = 0; k < 3; k++) {
                    sum += arr[i][j + k];
                    sum += arr[i + 2][j + k];
                }
                if (sum > max) max = sum;
            }
        }
        System.out.println("Max : " + max);
    }
}
