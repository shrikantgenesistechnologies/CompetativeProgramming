package com.Questions;
import java.util.Scanner;

public class DefuseBomb {
    public static void main(String[] args) {
        int n,k,i,sum=0,b,c;
        int[] a = new int[1000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        c = k;
        for(i = 0; i < n; i++, c = k, sum = 0){
            b = i;
            if(a[i] > 0){
                while(c > 0){
                    sum += a[(b + 1) % n];
                    b++;
                    c--;
                }
            }
            else{
                while(c > 0){
                    sum += a[(b + k) % n];
                    b--;
                    c--;
                }
            }
            System.out.println("sum : " + sum);
        }
    }
}