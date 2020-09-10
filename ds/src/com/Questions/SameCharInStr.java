package com.Questions;

public class SameCharInStr {
    static int notReplace(String str) {
        int count = 0;
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        for(int i = 0;i < str.length(); i++) {
            if(str.charAt(i) == str2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "alphxxdida";
        System.out.println("Result : " + notReplace(str));
    }
}
