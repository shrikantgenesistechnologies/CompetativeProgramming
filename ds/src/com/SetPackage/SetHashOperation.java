package com.SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetHashOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Remove    4. Size");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(s.isEmpty()){
                        System.out.println("Set is empty.");
                        break;
                    }
                    System.out.print("Your Set : ");
                    System.out.print("[");
                    Iterator it = s.iterator();
                    while(it.hasNext()) {
                        System.out.print(it.next() + " ");
                    }
                    System.out.println("]");
                    break;
                    
                case 2:
                    System.out.print("Enter value : ");
                    int value = sc.nextInt();
                    s.add(value);
                    System.out.println("Value inserted in Set.");
                    break;
                    
                case 3:
                    if(s.isEmpty()) {
                        System.out.println("Set is empty.");
                        break;
                    }
                    int key = sc.nextInt();
                    s.remove(key);
                    System.out.println("Value removed from set.");
                    break;
                    
                case 4:
                    if(s.isEmpty()) {
                        System.out.println("Set is empty.");
                        break;
                    }
                    System.out.println("Size of set : " + s.size());
                    break;
                    
                default:
                    System.out.println("Choosed invalid operation.");
                    break;
            }
            System.out.print("Want to continue (1 (Yes)/0(No)): ");
            c = sc.nextInt();
        }
        System.out.println("Thank you for using.");
    }
}
