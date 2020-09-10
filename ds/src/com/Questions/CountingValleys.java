package com.Questions;
import java.util.LinkedList;
import java.util.List;

public class CountingValleys {
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int valley = 0, k = 0, level = 0, i = 0;
        List<Integer> l = new LinkedList();
        l.add(level);
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)== 'U') {
                level--;
            }else if(s.charAt(j) == 'D') {
                level++;
            }
            l.add(level);
            if((l.get(j) == 1) && (k > 0) && (l.get(j-1) == 0))
                valley++;
            k++;
        }
        System.out.println(valley);
    }
}