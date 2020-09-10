package com.ListPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics2 {
    //Main method where execution will starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<String>();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Delete from position    4. Delete from begining     5.  Delete from end   6.  Sort Array");
            System.out.println("//7.  Addition    8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   //12.  Minimum     13.  Maximum    14.  Binary Search");
            System.out.println("15.  Reverse array");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Your arrayList : ");
                    Iterator<String> it = a.iterator();
                    System.out.print("[");
                    while(it.hasNext()) {
                        System.out.print(it.next() + ", ");
                    }
                    System.out.println("]");
                    break;

                case 2:
                    System.out.print("Enter your string values : ");
                    sc.nextLine();
                    String value = sc.nextLine();
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
                    
//                case 7:
//                    if(a.isEmpty()) {
//                        System.out.println("Your arrayList is empty.");
//                        break;
//                    }
//                    new ArrayListBasics2().arithmeticOperations("sum", a);
//                    break;
//                    
//                case 8:
//                    if(a.isEmpty()) {
//                        System.out.println("Your arrayList is empty.");
//                        break;
//                    }
//                    new ArrayListBasics2().arithmeticOperations("sub", a);
//                    break;
//                    
//                case 9:
//                    if(a.isEmpty()) {
//                        System.out.println("Your arrayList is empty.");
//                        break;
//                    }
//                    new ArrayListBasics2().arithmeticOperations("mul", a);
//                    break;
//                    
//                case 10:
//                    if(a.isEmpty()) {
//                        System.out.println("Your arrayList is empty.");
//                        break;
//                    }
//                    new ArrayListBasics2().arithmeticOperations("div", a);
//                    break;
//                    
//                case 11:
//                    if(a.isEmpty()) {
//                        System.out.println("Your arrayList is empty.");
//                        break;
//                    }
//                    new ArrayListBasics2().arithmeticOperations("mod", a);
//                    break;
                    
                case 12:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new ArrayListBasics2().minimum(a);
                    System.out.println("Minimum value from the ArrayList : "+Collections.min(a));
                    break;
                    
                case 13:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
//                    new ArrayListBasics2().maximum(a);
                    System.out.println("Maximum value from the ArrayList : "+Collections.max(a));
                    break;
                    
                case 14:
                    if(a.isEmpty()) {
                        System.out.println("Your arrayList is empty.");
                        break;
                    }
                    Collections.sort(a);
                    System.out.println("Enter value for search : ");
                    sc.nextLine();
                    String searchKey = sc.nextLine();
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