package com.QueuePackage;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class PBQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new PriorityBlockingQueue();
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Remove    4. Peek");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(q.isEmpty()){
                        System.out.println("Queue is empty.");
                        break;
                    }
                    System.out.print("Your Queue : ");
                    System.out.print("[");
                    Iterator it = q.iterator();
                    while(it.hasNext()) {
                        System.out.print(it.next()+" ");
                    }
                    System.out.println("]");
                    break;
                    
                case 2:
                    System.out.print("Enter value : ");
                    int value = sc.nextInt();
                    q.offer(value);
                    System.out.println("Value inserted in Queue.");
                    break;
                    
                case 3:
                    if(q.isEmpty()) {
                        System.out.println("Queue is empty.");
                        break;
                    }
                    System.out.println("Value "+ q.poll() +" removed.");
                    break;
                    
                case 4:
                    if(q.isEmpty()) {
                        System.out.println("Queue is empty.");
                        break;
                    }
                    System.out.println("First value in Queue : " + q.peek());
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
