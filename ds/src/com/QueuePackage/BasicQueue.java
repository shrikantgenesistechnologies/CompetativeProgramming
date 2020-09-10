package com.QueuePackage;
import java.util.Scanner;

public class BasicQueue {
    private static Scanner sc = new Scanner(System.in);
    private static int[] a;
    private static int head = -1, tail = -1;
    private static int size;
    public static void Basicqueue() {
        System.out.println("Welcome in Stack implementation : ");
        System.out.println("Please enter size of array : ");
        size = sc.nextInt();
        a = new int[size];
    }
    
    public static boolean empty(){
        if(tail == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean checkfull(){
        if(tail == size-1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void add(int value){
        if(checkfull()) {
            System.out.println("Queue is already full, Need to remove item before insertion.");
        } else {
            try {
                System.out.println("asdhjk");
                if(head == -1) {
                    head++;
                }
                tail++;
                System.out.println("head : "+head+", tail : "+tail);
                a[tail] = value;
                System.out.println("Value added in queue.");
            } catch(Exception ex) {
                System.out.println("Please enter size again.");
                head=-1;tail=-1;size=0;
            }
        }
    }
    
    public static int[] remove(){
        if(empty()) {
            System.out.println("Queue is empty.");
            return a;
        } else {
            int b[] = new int[tail];
            int free = a[head];
            for (int i = 0, k = head+1; i < tail; i++) {
                b[i] = a[k];
                k++;
            }
            if(tail == 0) {
                head = -1;
            }
            tail--;
            System.out.println("Value " + free + " removed from queue.");
            return b;
        }
    }
    
    public static void peek() {
        if(empty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("First value in Queue : " + a[head]);
        }
    }
    
    public static void main(String[] args) {
        new BasicQueue();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Add    3.  Remove    4. Peek    5.  Set size of array");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(empty()){
                        System.out.println("Queue is empty.");
                        break;
                    }
                    System.out.print("Your Queue : ");
                    System.out.print("[");
                    for (int i = 0; i <= tail; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println("]");
                    break;
                    
                case 2:
                    System.out.print("Enter value : ");
                    int value = sc.nextInt();
                    add(value);
                    break;
                    
                case 3:
                    a = remove();
                    break;
                    
                case 4:
                    peek();
                    break;
                    
                case 5:
                    if(size > 0) {
                        System.out.println("You have already selected size.");
                    } else {
                        Basicqueue();
                    }
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
