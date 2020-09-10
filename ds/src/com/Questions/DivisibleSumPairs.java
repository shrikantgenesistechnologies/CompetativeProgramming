package com.Questions;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int size = 5, k = 2, pairs = 0;
        int a[] = {5, 9, 10, 7, 4};//{1, 3, 2, 6, 1, 2};
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if(((a[i]+a[j])%k) == 0) {
                    pairs++;
                }
            }
        }
        System.out.println("Pairs : " + pairs);
    }
}
