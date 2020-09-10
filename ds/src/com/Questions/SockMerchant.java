package com.Questions;
import java.util.Set;
import java.util.TreeSet;

public class SockMerchant {
    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs_of_sock = 0;
        Set<Integer> ts = new TreeSet();
        for(int ls: a) {
            if(ts.add(ls) == false) {
                ts.remove(ls);
                pairs_of_sock++;
            }
        }
        System.out.println(pairs_of_sock);
    }
}
