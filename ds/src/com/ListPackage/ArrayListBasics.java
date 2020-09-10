package com.ListPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//class Input<T> {
//    T value;
//    Input() {
//        this.value = value;
//    }
//}

public class ArrayListBasics {
    //Basic arithmetic operations on array values
    public void arithmeticOperations(String operation, List<Integer> a) {
        int sum = 0, sub=a.get(0);
        long mul=1;
        double div = a.get(a.size()-1), mod = a.get(a.size()-1);
        if(operation.equals("sum")) {
            for (Integer a1 : a) {
                sum = sum + a1;
            }
            System.out.println("Addition of array values : " + sum);
        } else if(operation.equals("sub")) {
            for(int i = 1; i < a.size(); i++) {
                sub = sub - a.get(i);
            }
            System.out.println("Subtraction of array values : " + sub);
        } else if(operation.equals("mul")) {
            for (Integer a1 : a) {
                mul = mul * a1;
            }
            System.out.println("Multiplication of array values : " + mul);
        } else if(operation.equals("div")) {
            for(int i = 0; i < a.size()-2; i++) {
                div = a.get(i) / div;
            }
            System.out.println("Dividation of array values : " + div);
        } else if(operation.equals("mod")) {
            for(int i = 0; i < a.size()-2; i++) {
                mod = a.get(i) % mod;
            }
            System.out.println("Modules of array values : " + mod);
        }
    }
    //Minimum value from the array
//    public void minimum(ArrayList<Integer> a) {
//        try {
//            int min = a.get(0);
//            for (int i = 0; i < a.size(); i++) {
//                if(min > a.get(i)) {
//                    min = a.get(i);
//                }
//            }
//            System.out.println("Minimum from array : " + min);
//        } catch(Exception ex) {
//        }
//    }
//    //Maximum value from the array
//    public void maximum(ArrayList<Integer> a) {
//        try {
//            int max = a.get(0);
//            for (int i = 0; i < a.size(); i++) {
//                if(max < a.get(i)) {
//                    max = a.get(i);
//                }
//            }
//            System.out.println("Maximum from array : " + max);
//        } catch(Exception ex) {
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Delete from position    4. Delete from begining     5.  Delete from end   6.  Sort Array");
            System.out.println("7.  Addition    8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   12.  Minimum     13.  Maximum    14.  Binary Search");
            System.out.println("15.  Reverse array");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Your arrayList : ");
                    Iterator it = a.iterator();
                    System.out.print("[");
                    while(it.hasNext()) {
                        System.out.print(it.next() + " ");
                    }
                    System.out.println("]");
                    break;

                case 2:
                    System.out.println("Enter your value : ");
                    int value = sc.nextInt();
                    a.add(value);
                    System.out.println("Value added successfully.");
                    break;

                case 3:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    System.out.println("Enter position which value you want to delete from the array : ");
                    int key = sc.nextInt();
                    a.remove(key);
                    System.out.println("Value removed successfully.");
                    break;

                case 4:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    a.remove(0);
                    System.out.println("Value removed from begin successfully");
                    break;

                case 5:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    int size = a.size();
                    a.remove(size - 1);
                    System.out.println("Value removed from end successfully");
                    break;

                case 6:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    Collections.sort(a);
                    break;
                    
                case 7:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new ArrayListBasics().arithmeticOperations("sum", a);
                    break;
                    
                case 8:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new ArrayListBasics().arithmeticOperations("sub", a);
                    break;
                    
                case 9:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new ArrayListBasics().arithmeticOperations("mul", a);
                    break;
                    
                case 10:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new ArrayListBasics().arithmeticOperations("div", a);
                    break;
                    
                case 11:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new ArrayListBasics().arithmeticOperations("mod", a);
                    break;
                    
                case 12:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new ArrayListBasics().minimum(a);
                    System.out.println("Minimum value from the ArrayList : "+Collections.min(a));
                    break;
                    
                case 13:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new ArrayListBasics().maximum(a);
                    System.out.println("Maximum value from the ArrayList : "+Collections.max(a));
                    break;
                    
                case 14:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    Collections.sort(a);
                    System.out.println("Enter value for search : ");
                    int searchKey = sc.nextInt();
                    if(Collections.binarySearch(a, searchKey) >= 0) {
                        System.out.println("Key found in array.");
                    } else {
                        System.out.println("Key not found in array.");
                    }
                    break;
                    
                case 15:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    Collections.reverse(a);
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
