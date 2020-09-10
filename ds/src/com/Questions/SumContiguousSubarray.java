package com.Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SumContiguousSubarray {
    public static void main(String[] args) {
        int sum;
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
//        List<Integer> list = new ArrayList();
//        for (int i = 0; i < a.length; i++) {
//            sum = 0;
//            for (int j = i; j < a.length; j++) {
//                sum += a[j];
//                if(list.contains(sum)) continue;
//                list.add(sum);
//            }
//        }
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.max(list));
        
//        Iterator it = list.iterator();
//        System.out.print("[");
//        while(it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//        System.out.println("]");
        
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        System.out.println("Here : " + max_so_far);
        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        }
        System.out.println("max_so_far : " + max_so_far);
    }
}