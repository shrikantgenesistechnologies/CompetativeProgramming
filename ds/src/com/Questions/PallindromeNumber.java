package com.Questions;

import java.util.Scanner;
public class PallindromeNumber {
    static int pallindrome(int no1) {
            int rem=0;
            int div = no1;
            while (div != 0)
            {
                int r = div % 10;
                rem = (rem * 10) + r;
                div = div / 10;
            }
            return rem;
	}
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Lower and Upper Limit : ");
            int ll = sc.nextInt();
            int ul = sc.nextInt();
            for (int i = ll; i <= ul; i++) {
                if(i == pallindrome(i)) 
                    System.out.println(i);
            }
	}
}