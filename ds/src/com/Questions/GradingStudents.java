package com.Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades = new ArrayList();
        for(int i=0;i<61;i++) {
            grades.add(sc.nextInt());
        }
        int size = grades.size();
        List<Integer> ar = new ArrayList();
        for(int i = 0; i < size; i++) {
            if(grades.get(i) < 38){
                ar.add(grades.get(i));
            } else if(grades.get(i)%5 == 0) {
                ar.add(grades.get(i));
            } else {
                if((grades.get(i)+1)%5 == 0) {
                    ar.add(grades.get(i)+1);
                } else if((grades.get(i)+2)%5 == 0){
                    ar.add(grades.get(i)+2);
                } else {
                    ar.add(grades.get(i));
                }
            }
        }
        Iterator ti = grades.iterator();
        System.out.print("[");
        while(ti.hasNext()) {
            System.out.print(ti.next()+" ");
        }
        System.out.println("]");
        Iterator it = ar.iterator();
        System.out.print("[");
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println("]");
    }
}

