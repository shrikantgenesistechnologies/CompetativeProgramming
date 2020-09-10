package com.Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BirthdayChoclate {
    static int sum(Queue<Integer> q) {
        int sum=0;
        for(int i : q) {
            sum = sum + i;
        }
        return sum;
    }
    //Using Sliding window technique here nad replace max logic to sum
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        int month = 7, day = 18;
        ArrayList ans = new ArrayList();
        Queue<Integer> q = new LinkedBlockingQueue<Integer>();
        int count = 0, k = 0, sumation = 0 ;
        for(int i = 0;i < a.length; i++) {     //for(int i : a) {
            q.add(a[i]);                       //q.add(i);
            count++;
            if(count == month) {
                count -= 1;
                sumation = sum(q);
                System.out.println("out sum of " +i+" : "+sumation);
                if(day == sumation) {
                    System.out.println("sum of " +i+" : "+sumation);
                    ans.add(sumation);
                }
                k++;
                q.remove();
            }
        }
        System.out.println("Ans : "+ans.size());
//        Iterator it = ans.iterator();
//        System.out.print("[ ");
//        while(it.hasNext()) {
//            System.out.print(it.next() + ", ");
//        }
//        System.out.println("]");
    }
}