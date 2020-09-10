package com.ListPackage;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> a = new Stack();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Push   3.  Pop    4.  Top element    6.  Sort Array7.  Addition    ");
            System.out.println("8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   12.  Minimum     13.  Maximum");
            System.out.println("14.  Binary Search    15.  Reverse stack    18.  Converted to array");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(a.empty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    System.out.print("Your stack : ");
                    ListIterator it = a.listIterator();
                    System.out.print("[");
                    while(it.hasNext()) {
                        System.out.print(it.next() + " ");
                    }
                    System.out.println("]");
                    break;
                
                case 2:
                    System.out.println("Enter your value : ");
                    int value = sc.nextInt();
                    a.push(value);
                    break;
                    
                case 3:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    int free = a.pop();
                    System.out.println(free + " Element popped.");
                    break;
                    
                case 4:
                    System.out.println("Top of the stack element is "+a.peek());
                    break;
                    
                case 6:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    Collections.sort(a);
                    System.out.println("Stack sorted.");
                    break;
                
                case 7:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("sum", a);
                    break;
                
                case 8:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("sub", a);
                    break;
                
                case 9:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("mul", a);
                    break;
                
                case 10:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("div", a);
                    break;
                
                case 11:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    new VectorOperation().arithmeticOperations("mod", a);
                    break;
                
                case 12:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    System.out.println("Minimum from Stack : "+Collections.min(a));
                    break;
                    
                case 13:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
                        break;
                    }
                    System.out.println("Maximum from Stack : "+Collections.max(a));
                    break;
                    
                case 14:
                    if(a.isEmpty()) {
                        System.out.println("Stack is empty.");
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
                    System.out.println("Stack is empty.");
                    break;
                }
                Collections.reverse(a);
                System.out.println("Reverse of Stack is done. ");
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
