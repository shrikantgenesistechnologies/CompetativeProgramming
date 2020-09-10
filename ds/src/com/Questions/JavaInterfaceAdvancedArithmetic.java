package com.Questions;
import java.util.Scanner;

//Divisor of a number(N) will be divided by number(K)

//This program is the sum of divisors of particular number(N)
class MyCalculator {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class JavaInterfaceAdvancedArithmetic{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
}