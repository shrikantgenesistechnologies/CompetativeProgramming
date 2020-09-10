//Challenge from Controll Statements  ---->  Learning Java

package com.LinkedinLearning;
import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        String question = "Which one of the following is not a prime number?";
        String choiceOne = "31";
        String choiceTwo = "91";
        String choiceThree = "71";
        String correctAnswer = choiceTwo;
        String userAnswer;
        Scanner sc = new Scanner(System.in);
        System.out.println(question+"\na) "+choiceOne+"    b) "+choiceTwo+"   c) "+choiceThree);
        userAnswer = sc.next();
        if(userAnswer.equals(correctAnswer)) {
            System.out.println("Congrats! That's the correct answer.");
        } else {
            System.out.println("You are incorrect. The correct answer is "+ correctAnswer);
        }
    }
}
