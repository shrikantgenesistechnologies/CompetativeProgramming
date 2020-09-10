package com.Questions;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AccentureQues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int arrsize = sc.nextInt();
		int[] main = new int[arrsize];
		ArrayList<Integer> even = new<Integer>ArrayList();  
		ArrayList<Integer> odd = new<Integer>ArrayList();
		
		System.out.println("Enter "+arrsize+" Elements");
		for (int i = 0; i < arrsize; i++)
			main[i] = sc.nextInt();
	    for (int i = 0; i < arrsize; i++) {
			if(i%2==0)
				even.add(main[i]);
			else 
				odd.add(main[i]);
		}
		Collections.sort(even);
		Collections.sort(odd);
		
		System.out.println("Even position index");
		for (int e : even)
			System.out.println(e);
		System.out.println("Odd position index");
		for (int e : odd) 
			System.out.println(e);
		
		int evenlargest=0,evensec=0,oddlargest=0,oddsec=0;
		for (int i = 0; i < even.size(); i++) {  // In this section we're finding largest element in odd and even List
			if(even.get(i)>evenlargest) 
				evenlargest = even.get(i);
			for (int j = 0; j < odd.size(); j++) 
				if(odd.get(j)>oddlargest) 
					oddlargest = odd.get(i);
		}
		for (int i = 0; i < even.size(); i++)  // here we're finding 2nd largest element in off and 
			if((even.get(i)>evensec) && even.get(i) < evenlargest) {
				evensec=even.get(i);
		}
		for (int i = 0; i < odd.size(); i++) {
		if((odd.get(i)>oddsec) && odd.get(i)<oddlargest) 
	    	oddsec=odd.get(i);
	    }
		System.out.println("Second Largest Element in Even List is:"+evensec);
		System.out.println("Second Largest Element in Odd List is:"+oddsec);
		System.out.println("Sum Of Second Largest Element Of Odd and Even List:"+(evensec+oddsec));
	}

}
