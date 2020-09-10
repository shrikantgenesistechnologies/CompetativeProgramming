package com.ListPackage;
import java.util.Scanner;

public class BasicStack {
    private static Scanner sc = new Scanner(System.in);
    private static int[] a;
    private static int top = -1;
    private static int size;
    public BasicStack() {
        System.out.println("Welcome in Stack implementation : ");
        System.out.println("Please enter size of array : ");
        size = sc.nextInt();
        a = new int[size];
    }
    
    public static boolean checkfull() {
        if(top == size-1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void push(int value) {
        if(checkfull()) {
            System.out.println("Your stack is full. Need to pop at least one value.");
        } else {
            top++;
            a[top] = value;
            System.out.println("Value Inserted.");
        }
    }
    
    public static boolean empty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void pop() {
        if(empty()){
            System.out.println("Your stack is empty.");
        } else {
            int temp = a[top];
            top--;
            System.out.println("Value "+temp+" is popped.");
        }
    }
    
    public static int peek() {
        if(empty()){
            System.out.println("Your stack is empty.");
            return 0;
        } else {
            return a[top];
        }
    }
    
    public static void main(String[] args) {
        new BasicStack();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Push    3.  Pop    4. Peek");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(empty()){
                        System.out.println("Stack is empty.");
                        break;
                    }
                    System.out.println("Your Stack : ");
                    System.out.println("[");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(a[i]);
                    }
                    System.out.println("]");
                    break;
                    
                case 2:
                    System.out.print("Enter value : ");
                    int value = sc.nextInt();
                    push(value);
                    break;
                    
                case 3:
                    pop();
                    break;
                    
                case 4:
                    System.out.println("Top value in stack : " + peek());
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
