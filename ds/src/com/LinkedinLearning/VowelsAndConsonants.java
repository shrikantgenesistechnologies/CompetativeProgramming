package com.LinkedinLearning;

public class VowelsAndConsonants {
    public static int findWord(String text) {
        int space = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                space++;
            }
        }
        return space;
    }
    public static int findVowel(String text) {
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                vowels++;
            }
        }
        return vowels;
    }
    public static int findConsonant(String text) {
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ' || text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
            } else {
                consonants++;
            }
        }
        return consonants;
    }
    public static void main(String[] args) {
        String text = "Using wildcards in generic programming";
        text = text.toLowerCase();
        System.out.println("Words : " + findWord(text));
        System.out.println("Vowels : " + findVowel(text));
        System.out.println("Consonants : " + findConsonant(text));
    }
}
