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
    public static int findVowel(String text, String characters) {
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if(characters.contains(text.charAt(i))){
                vowels++;
            }
        }
        return vowels;
    }
    public static int findConsonant(String text, String characters) {
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            if(!characters.contains(text.charAt(i))){
                consonants++;
            }
        }
        return consonants;
    }
    public static void main(String[] args) {
        String text = "Using wildcards in generic programming";
        text = text.toLowerCase();
        String characters = "aeiouAEIOU";
        System.out.println("Words : " + findWord(text));
        System.out.println("Vowels : " + findVowel(text, characters));
        System.out.println("Consonants : " + findConsonant(text, characters));
    }
}
