package com.Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    static String armstrong(int value) {
        int m = value, num = 0, count = 0;
        List list = new ArrayList();
        while(m != 0) {
            list.add(m % 10);
            m = m / 10;
            count++;
        }
        Iterator it = list.iterator();
        while(it.hasNext()) num += Math.pow((int) it.next(), count);
        if(value == num) return "ARMSTRONG";
        else return "NOT ARMSTRONG";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(armstrong(value));
    }
}
