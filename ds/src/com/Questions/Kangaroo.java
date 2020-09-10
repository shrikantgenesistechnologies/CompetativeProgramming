package com.Questions;

public class Kangaroo {
    public static void main(String[] args) {
        //x1, v1: integers, starting position and jump distance for kangaroo 1
        //x2, v2: integers, starting position and jump distance for kangaroo 2
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        if(v1 > v2 && ((x2-x1)%(v1-v2) == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}