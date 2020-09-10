package com.Questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class COVID {
    public static void main(String[] args) {
        //Third Solution
        
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        int d = sc.nextInt();
//        int[] a = new int[p];
//        int doc = 0, i = 0, sum, value = 0;
//        int[] temp = new int[p];
//        int[] minar = new int[p];
//        int[] maxar = new int[p];
//        int min = 0, max = 0;
//        while(doc < d) {
//            sum = 0;
//            for(i = 0; i < p; i++) {
//                temp[i] = sc.nextInt();
//                sum += temp[i];
//            }
//            if(doc == 0) {
//                min = max = sum;
//            }
//            if (min >= sum) {
//                min = sum;                
//                for(i = 0; i < p; i++) {
//                    minar[i] = temp[i];
//                }
//            }
//            if (max <= sum) {
//                max = sum;                
//                for(i = 0; i < p; i++) {
//                    maxar[i] = temp[i];
//                }
//            }
//            doc++;
//        }
//        for(i = 0; i < p; i++) {
//            temp[i] = maxar[i];
//        }
//        Set<Integer> set = new HashSet();
//        sum = 0;
//        int count = 0, top = 0, k = 0;
//        for(i = 0; i <= p; i++) {
//            if(i < p && minar[i] < temp[i]) {
//                temp[i] = minar[i];
//                k = i;
//                count++;
//            } else if(i == k + 1) {
//                for(int j = 0; j < p; j++) {
//                    sum += temp[j];
//                }
//                set.add(sum);
//                top++;
//            }
//            if((count > 0 && top > 0) || (count > 0 && top == 0)) {
//                for (int c = 0; c < p; c++) {
//                    temp[c] = maxar[c];
//                }
//                count = 0; top = 0; sum = 0;
//            }
//        }
//        System.out.println(Collections.min(set));

//Second Solution
        
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[p];
        int doc = 0, i = 0, sum, value = 0;
        int[] temp = new int[p];
        int[] minar = new int[p];
        int[] maxar = new int[p];
        int min = 0, max = 0, min_sum = 0, max_sum = 0;
        while(doc < d) {
            sum = 0;
            for(i = 0; i < p; i++) {
                temp[i] = sc.nextInt();
                sum += temp[i];
            }
            if(doc == 0) {
                min = max = sum;
            }
            if (min >= sum) {
                min = sum;
                min_sum = 0;
                for(i = 0; i < p; i++) {
                    minar[i] = temp[i];
                    min_sum += minar[i];
                }
            }
            if (max <= sum) {
                max = sum;
                max_sum = 0;
                for(i = 0; i < p; i++) {
                    maxar[i] = temp[i];
                    max_sum += maxar[i];
                }
            }
            doc++;
        }
        System.out.print("Min array : [");
        for(i = 0; i < p; i++) {
            System.out.print(minar[i]+" ");
        }
        System.out.println("] Min_Sum : " + min_sum);
        System.out.print("Max array : [");
        for(i = 0; i < p; i++) {
            temp[i] = maxar[i];
            System.out.print(maxar[i]+" ");
        }
        System.out.println("] Max_Sum : " + max_sum);
        
        Set<Integer> set = new HashSet();
        set.add(min_sum);
        set.add(max_sum);
        sum = 0;
        int count = 0, top = 0, k = 0;
        for(i = 0; i <= p; i++) {
            
            if(i < p && minar[i] < temp[i]) {
                temp[i] = minar[i];
                k = i;
                count++;
                System.out.println("here count : "+count);
//                continue;
            } else if(i == k + 1 && count > 0) {
                for(int j = 0; j < p; j++) {
                    sum += temp[j];
                }
                System.out.println("Sum in : " + sum);
                set.add(sum);
                top++;
                System.out.println("here top : "+top);
            }
            if(count > 0 && top > 0) {
                System.out.print("temp : [");
                for (int c = 0; c < p; c++) {
                    System.out.print(temp[c] + " ");
                }
                System.out.println("]");
            }
            if(count > 0 && top > 0) { 
                System.out.print("temp : [");
                for (int c = 0; c < p; c++) {
                    temp[c] = maxar[c];
                    System.out.print(temp[c] + " ");
                }
                count = 0; top = 0; sum = 0;
                System.out.println("]");
            }
        }
        System.out.println("Min : " + Collections.min(set));
        
        
        //First solution
        
//        int doc = 0, i = 0, sum = 0, value;
//        List<Integer> list = new ArrayList();
//        while(doc < d) {
//            for(i = 0; i < p; i++) {
//                value = sc.nextInt();
//                list.add(value);
//            }
//            doc++;
//        }
        System.out.print("List : [");
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("]");
//        int[] min = new int[p];
//        for(i = 0; i < p; i++) {
//            min[i] = list.get(i);
//            for(int val = i, j=0; j < d; val += p, j++) {
//                if(min[i] > list.get(val)) {
//                    min[i] = list.get(val);
//                }
//            }
//            sum += min[i];
//        }
//        for(i = 0; i < min.length; i++) {
//            sum += min[i];
//        }
//        System.out.println(sum);
        
    }
}
