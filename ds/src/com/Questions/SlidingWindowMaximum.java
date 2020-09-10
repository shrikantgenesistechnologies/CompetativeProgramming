package com.Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int a[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
        int window = 3;
        ArrayList ans = new ArrayList();
        Queue<Integer> q = new LinkedBlockingQueue<Integer>();
        int count = 0, k = 0;
        for(int i = 0;i < a.length; i++) {
            q.add(a[i]);
            count++;
            if(count == window) {
                count -= 1;
                ans.add(Collections.max(q));
                k++;
                q.remove();
            }
        }
        Iterator it = ans.iterator();
        System.out.print("[ ");
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println("]");
    }
}