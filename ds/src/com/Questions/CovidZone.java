package com.Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CovidZone {
    public static void main(String[] args) {
        String[] a = {"r", "o", "g"};
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ro = sc.nextInt();
        int rg = sc.nextInt();
        int or = sc.nextInt();
        int og = sc.nextInt();
        int gr = sc.nextInt();
        int go = sc.nextInt();
        
        List<String> list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < N+1; j++) {
                list.add(a[i]+a[j]);
            }
        }
        Iterator it = list.iterator();
        System.out.print("List : [");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("]");
    }
}
