package com.Questions;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int min, f_turn = 0, e_turn = 0;
//        if(n%2 == 0) {
            for (int i=1;i<n;i = i+2) {
                if(i >= p) continue;
                f_turn++;
            }
            if((n % 2) != 0) n = n-1;
            for (int i=n;i>=1;i = i-2) {
                if(i <= p) continue;
                e_turn++;                
            }
//        }
        System.out.println("befor ans f_turn : "+f_turn);
        System.out.println("before ans e_turn : "+e_turn);
        if(f_turn < e_turn) {
            System.out.println("f_turn : "+f_turn);
        } else {
            System.out.println("e_turn : "+e_turn);
        }
    }
}
