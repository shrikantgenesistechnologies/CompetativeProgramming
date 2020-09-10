package com.ListPackage;

import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperation {
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
        LinkedList<Integer> a = new LinkedList<Integer>();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Delete from position    4. Delete from begining     5.  Delete from end   6.  Sort Array");
            System.out.println("7.  Addition    8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   12.  Minimum     13.  Maximum    14.  Binary Search");
            System.out.println("15.  Reverse array      16.  Insert from begin      17.  Insert at position     18.  Converted to array");
            System.out.print("     19.  Reverse half of the list");
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
                    try {
                        System.out.println("Enter position which value you want to delete from the array : ");
                        int key = sc.nextInt();
                        a.remove(key);
                        System.out.println("Key removed from position successfully.");
                    } catch(IndexOutOfBoundsException ex) {
                        System.out.println("Key not found in LinkedList");
                    }
                    break;

                case 4:
                    if(a.isEmpty()) {
                        System.out.println("Your LinkedList is empty.");
                        break;
                    }
                    try {
                        a.remove(0);
                        System.out.println("Key removed from begin successfully");
                    } catch(IndexOutOfBoundsException ex) {
                        System.out.println("Key not found in Linkedlist.");
                    }
                    break;

                case 5:
                    if(a.isEmpty()) {
                        System.out.println("Your LinkedList is empty.");
                        break;
                    }
                    try {
                        int size = a.size();
                        a.remove(size - 1);
                        System.out.println("Value removed from end successfully");
                    } catch(IndexOutOfBoundsException ex) {
                        System.out.println("Key not found in Linkedlist.");
                    }
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
                    new LinkedListOperation().arithmeticOperations("sum", a);
                    break;
                    
                case 8:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new LinkedListOperation().arithmeticOperations("sub", a);
                    break;
                    
                case 9:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new LinkedListOperation().arithmeticOperations("mul", a);
                    break;
                    
                case 10:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new LinkedListOperation().arithmeticOperations("div", a);
                    break;
                    
                case 11:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    new LinkedListOperation().arithmeticOperations("mod", a);
                    break;
                    
                case 12:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new LinkedListOperation().minimum(a);
                    System.out.println("Minimum value from the ArrayList : "+Collections.min(a));
                    break;
                    
                case 13:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new LinkedListOperation().maximum(a);
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
                    
                case 16:
                    System.out.println("Enter your value : ");
                    value = sc.nextInt();
                    a.addFirst(value);
                    break;
                    
                case 17:
                    System.out.println("Enter your value : ");
                    value = sc.nextInt();
                    a.addLast(value);
                    break;
                    
                case 18:
                    if(a.isEmpty()) {
                        System.out.println("Your LinkedList is empty.");
                        break;
                    }
                    System.out.println("Your Linked List converted to Array : ");
                    Object[] arr = a.toArray();
                    for(int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
                    
                case 19:
                    if(a.isEmpty()) {
                        System.out.println("Your LinkedList is empty.");
                        break;
                    }
                    int len_list = a.size()-1;
                    int mid_len_list = len_list/2;
                    List sub_a = new LinkedList(a.subList(mid_len_list+1, a.size()));
                    Collections.reverse(sub_a);
                    System.out.println("length: "+len_list);
                    System.out.println("mid_length: "+mid_len_list);
                    while(mid_len_list != len_list){
                        try {
                            a.remove(len_list);
                        } catch(IndexOutOfBoundsException ex) {
                            System.out.println("Key not found in Linkedlist.");
                        }
                        len_list--;
                    }
                    System.out.println(a);
                    System.out.println(sub_a);
                    //1, 2, 3, 6, 5, 100, 991, 4, 9, 48, 32, 100
                    a.addAll(mid_len_list + 1, sub_a);
                    System.out.println(a);
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