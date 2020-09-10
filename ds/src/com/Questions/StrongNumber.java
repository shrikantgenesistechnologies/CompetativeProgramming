package com.Questions;
import java.util.Scanner;

public class StrongNumber {
    static String strong(int value) {
        int m = value, i = 0;
        int val, fact, sum = 0;
        while(m != 0) {
            val = m % 10;
            fact = 1;
            while(val != 1) {
                fact *= val;
                val--;
            }
            sum += fact;
            m = m / 10;
            i++;
        }
        if(value == sum) return "STRONG";
        else return "NOT STRONG";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(strong(value));
    }
}