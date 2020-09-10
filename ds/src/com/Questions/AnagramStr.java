package com.Questions;
import java.util.Arrays;

public class AnagramStr {
    public static void main(String[] args) {
        String str1 = "eat", str2 = "ate";
        char[] charArray = str1.toCharArray();
        char[] charArray1 = str2.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        Object[] obj1 = {charArray};
        Object[] obj2 = {charArray1};
        System.out.println("Result : " + Arrays.deepEquals(obj1, obj2));
    }
}
