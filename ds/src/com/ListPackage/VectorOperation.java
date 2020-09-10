package com.ListPackage;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class VectorOperation {
    //Basic arithmetic operations on array values
    public void arithmeticOperations(String operation, Vector<Integer> a) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> a = new Vector<Integer>();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert   3.  Delete from position    4. Delete from begining     5.  Delete from end   6.  Sort Array");
            System.out.println("7.  Addition    8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   12.  Minimum     13.  Maximum    14.  Binary Search");
            System.out.println("15.  Reverse vector     16.  Insert at begining     17.  Insert at position    18.  Converted to array");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    System.out.print("Your VectorList : ");
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
                    break;
                    
                case 3:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    System.out.println("Enter position where from you want to delete value : ");
                    int pos = sc.nextInt();
                    a.remove(pos);
                    break;
                    
                case 4:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    a.removeElementAt(0);
                    System.out.println("Element deleted from begining.");
                    break;
                    
                case 5:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    a.removeElementAt(a.size()-1);
                    System.out.println("Element deleted from last.");
                    break;
                    
                case 6:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    Collections.sort(a);
                    System.out.println("Vector List sorted.");
                    break;
                
                case 7:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("sum", a);
                    break;
                
                case 8:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("sub", a);
                    break;
                
                case 9:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("mul", a);
                    break;
                
                case 10:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("div", a);
                    break;
                
                case 11:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("mod", a);
                    break;
                
                case 12:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    System.out.println("Minimum from Vector list : "+Collections.min(a));
                    break;
                    
                case 13:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    System.out.println("Maximum from Vector list : "+Collections.max(a));
                    break;
                    
                case 14:
                    if(a.isEmpty()) {
                        System.out.println("Vector list is empty.");
                        break;
                    }
                    System.out.println("Enter value for search : ");
                    int key = sc.nextInt();
                    if(Collections.binarySearch(a, key) >= 0) {
                        System.out.println("Key found.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                   
                case 15:
                if(a.isEmpty()) {
                    System.out.println("Vector list is empty.");
                    break;
                }
                Collections.reverse(a);
                System.out.println("Reverse of Vector list is done. ");
                break;
   
                case 16:
                if(a.isEmpty()) {
                    System.out.println("Vector list is empty.");
                    break;
                }
                System.out.println("Enter value for begining : ");
                value = sc.nextInt();
                a.insertElementAt(value, 0);
                System.out.println("Reverse of Vector list is done. ");
                break;

                case 17:
                if(a.isEmpty()) {
                    System.out.println("Vector list is empty.");
                    break;
                }
                System.out.println("Enter value for position : ");
                value = sc.nextInt();
                System.out.println("Enter position : ");
                pos = sc.nextInt();
                a.insertElementAt(value, pos);
                System.out.println("Vector value is inserted.");
                break;

                case 18:
                if(a.isEmpty()) {
                    System.out.println("Vector list is empty.");
                    break;
                }
                System.out.println("Vector to Array : ");
                Object[] arr = a.toArray();
                for(int i=0;i<arr.length;i++) {
                    System.out.println(arr[i]);
                }
                break;

                default:
                    System.out.println("Invalid Operation choosed.");
        }
            System.out.print("Want to continue (1 (Yes)/0(No)): ");
            c = sc.nextInt();
        }
        System.out.println("Thank you for using.");
    }
}
