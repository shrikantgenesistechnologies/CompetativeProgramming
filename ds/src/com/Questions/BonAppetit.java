package com.Questions;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();                                                //Insert size of Array
        System.out.println("Enter didn't eat item of Array for Anna : ");
        int pos = sc.nextInt();                                                 //Insert item which not eated by Anna
        int value;
        List<Integer> list = new Vector();
        System.out.print("Enter Array : ");
        for (int i = 0; i < size; i++) {
            value = sc.nextInt();
            list.add(value);
        }
        System.out.println("Enter shared money to Array : ");                   //Insert shared money to Anna
        int shared_money = sc.nextInt();
        int i = 0, sum = 0;
        Object[] a = list.toArray();
        for (i = 0; i < a.length; i++) {
            if(i == pos) {
                continue;
            }
            sum += (int) a[i];
        }
        int actual_shared = sum / 2;
        if(actual_shared != shared_money) {
            System.out.println(shared_money - actual_shared);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
