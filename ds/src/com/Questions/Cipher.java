package com.Questions;

public class Cipher {
    static char cipher( char ch, int n) {
        char sch;
        int sint;
        int z = (int) ch;
        if(Character.isUpperCase(ch)) {
            sint = ((z+n-65)%26 + 65);
            sch = (char)((z+n-65)%26 + 65);
        } else {
            sint = ((z+n-97)%26 + 97);
            sch = (char)((z+n-97)%26 + 97);
        }
        System.out.println("Upper case int : " + sint);
        return sch;
    }
    public static void main(String[] args) {
        char ch = 'O';
        int key = 9;
        System.out.println("Result : " + cipher(ch, key));
        
        char ch1 = 'Z';
        int key1 = 36;
        System.out.println("Result : " + cipher(ch1, key1));
    }
}
