package com.ListPackage;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static Scanner sc = new Scanner(System.in);
    //Check array is empty or not
    public int checkArrayEmpty(int[] a) {
        if(a.length == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    //Print full array on output screen
    public void showArray(int[] a) {
        int ans = checkArrayEmpty(a);
        if(ans == 1) {
            System.out.print("[");
            for(int i = 0; i < a.length; i++) {
                if(i == a.length-1) {
                    System.out.print(a[i]);
                }else {
                    System.out.print(a[i] + ", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Your array is empty.");
        }
    }
    //Insert values in array
    public int[] insertArray(int[] a) {
        int ans = checkArrayEmpty(a);
        System.out.println("ans : "+ans);
        if(ans == 1) {
            System.out.println("Array is not empty.");
            return a;
        }
        Scanner cs = new Scanner(System.in);
        int[] b = new int[10];
        for(int i = 0; i < 10; i++) {
            b[i] = cs.nextInt();
        }
        return b;
    }
    //Delete value from array
    public int[] deletevalArray(int[] a) {
        try{
            int ans = checkArrayEmpty(a);
            if(ans == 1) {
                int[] b = new int[a.length - 1];
                int k = 0;
                int value = sc.nextInt();
                for(int i = 0; i < a.length; i++) {
                    if(a[i] == value) {
                        continue;
                    }
                    b[k++] = a[i];
                }
                return b;
            } else {
                System.out.println("Your array is empty.");
                return a;
            }
        } catch(Exception ex) {
            return a;
        }
    }
    //Delete value from begin of the array
    public int[] deletefirstArray(int[] a) {
        try {
            int ans = checkArrayEmpty(a);
            if(ans == 1) {
                int[] b = new int[a.length - 1];
                int k = 0;
                for(int i = 0; i < a.length; i++) {
                    if(i == 0) {
                        continue;
                    }
                    b[k++] = a[i];
                }
                return b;
            } else {
                System.out.println("Your array is empty.");
                return a;
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return a;
        }
    }
    //Delete value from end of the array
    public int[] deleteendArray(int[] a) {
        try {
            int ans = checkArrayEmpty(a);
            if(ans == 1) {
                int[] b = new int[a.length - 1];
                int k = 0;
                for(int i = 0; i < a.length; i++) {
                    if(i == a.length-1) {
                        continue;
                    }
                    b[k++] = a[i];
                }
                return b;
            } else {
                System.out.println("Your array is empty.");
                return a;
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return a;
        }
    }
    //Basic arithmetic operations on array values
    public void arithmeticOperations(String operation, int[] a) {
        int sum = 0, sub=a[0];
        long mul=1;
        double div = a[a.length-1], mod = a[a.length-1];
        if(operation.equals("sum")) {
            for(int i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            System.out.println("Addition of array values : " + sum);
        } else if(operation.equals("sub")) {
            for(int i = 1; i < a.length; i++) {
                sub = sub - a[i];
            }
            System.out.println("Subtraction of array values : " + sub);
        } else if(operation.equals("mul")) {
            for(int i = 0; i < a.length; i++) {
                mul = mul * a[i];
            }
            System.out.println("Multiplication of array values : " + mul);
        } else if(operation.equals("div")) {
            for(int i = 0; i < a.length-2; i++) {
                div = a[i] / div;
            }
            System.out.println("Dividation of array values : " + div);
        } else if(operation.equals("mod")) {
            for(int i = 0; i < a.length-2; i++) {
                mod = a[i] % mod;
            }
            System.out.println("Modules of array values : " + mod);
        }
    }
    //Minimum value from the array
    public void minimum(int[] a) {
        try {
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if(min > a[i]) {
                    min = a[i];
                }
            }
            System.out.println("Minimum from array : " + min);
        } catch(Exception ex) {
        }
    }
    //Maximum value from the array
    public void maximum(int[] a) {
        try {
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if(max < a[i]) {
                    max = a[i];
                }
            }
            System.out.println("Maximum from array : " + max);
        } catch(Exception ex) {
        }
    }
    //Binary search on array and foind the search value
//    public void binarySearchArray(int[] a, int key) {
//        int low = 0, found = 0;
//        int high = a.length - 1;
//        while(low <= high) {
//            int mid = (high + low) / 2;
//            if(a[mid] == key) {
//                found = 1;
//                break;
//            }
//            if(a[mid] < key) {
//                low = mid + 1;
//            }
//            if(a[mid] > key) {
//                high = mid - 1;
//            }
//        }
//        if(found == 0) {
//            System.out.println("Key not found in array.");
//        } else {
//            System.out.println("Key found in array.");
//        }
//    }
    //Sort array in ascending order
//    public int[] sortArray(int[] a) {
//        try {
//            int ans = checkArrayEmpty(a);
//            if(ans == 1) {
//                for(int i = 0; i < a.length; i++) {
//                    for(int j = i+1; j < a.length; j++) {
//                        if(a[i] > a[j]) {
//                            int temp = a[i];
//                            a[i] = a[j];
//                            a[j] = temp;
//                        }
//                    }
//                }
//                return a;
//            } else {
//                System.out.println("Your array is empty.");
//                return a;
//            }
//        } catch(Exception ex) {
//            System.out.println(ex.getMessage());
//            return a;
//        }
//    }
    //Main method where excution will be starts
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("For Initialization first you need to create array. Please enter array values(10) : ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int c = 1;
        while(c == 1) {
            System.out.println("Now you can choose operations : ");
            System.out.println("1.  Traverse    2.  Insert    3.  Delete from position    4. Delete from begining     5.  Delete from end   6.  Sort Array");
            System.out.println("7.  Addition    8.  Subtraction    9.  Multiplication    10. Dividation     11.  Modules   12.  Minimum     13.  Maximum    14.  Binary Search");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Your array : ");
                    new ArrayOperations().showArray(a);
                    break;

                case 2:
                    System.out.println("Enter your values in a single line with single space : ");
                    a = new ArrayOperations().insertArray(a);
                    break;

                case 3:
                    System.out.println("Enter value which you want to delete from the array : ");
                    a = new ArrayOperations().deletevalArray(a);
                    break;

                case 4:
                    a = new ArrayOperations().deletefirstArray(a);
                    break;

                case 5:
                    a = new ArrayOperations().deleteendArray(a);
                    break;

                case 6:
                    Arrays.sort(a);
//                    a = new ArrayOperations().sortArray(a);
                    break;
                    
                case 7:
                    new ArrayOperations().arithmeticOperations("sum", a);
                    break;
                    
                case 8:
                    new ArrayOperations().arithmeticOperations("sub", a);
                    break;
                    
                case 9:
                    new ArrayOperations().arithmeticOperations("mul", a);
                    break;
                    
                case 10:
                    new ArrayOperations().arithmeticOperations("div", a);
                    break;
                    
                case 11:
                    new ArrayOperations().arithmeticOperations("mod", a);
                    break;
                    
                case 12:
                    new ArrayOperations().minimum(a);
                    break;
                    
                case 13:
                    new ArrayOperations().maximum(a);
                    break;
                    
                case 14:
                    Arrays.sort(a);
                    System.out.println("Enter value for search : ");
                    int key = sc.nextInt();
//                    new ArrayOperations().binarySearchArray(a, key);
                    if(Arrays.binarySearch(a, key) >= 0){
                        System.out.println("Key found in array.");
                    } else {
                        System.out.println("Key not found in array.");
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