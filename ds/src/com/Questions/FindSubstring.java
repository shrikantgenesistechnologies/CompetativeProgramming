package com.Questions;

public class FindSubstring {
    public static void main(String[] args) {
        String str = "bjfhkjdlkajdlajdadmaaabcabckjdnkabaabc", sub = "abc";
        int i=0, j, l, len1, len2;
        int count = 0, count1 = 0;
        len1 = str.length();
        len2 = sub.length();
        while (i < len1)
        {
            l = i;
            j = 0;
            count = 0;
            while (str.charAt(l) == sub.charAt(j)) 
            {
                count++;
                i++;
                l = i;
                j++;
                if(j == len2) { break; }
            }
            if (count == len2) 
            {
                count1++;
            }
            if(count == 0) { i++; }
        }
        System.out.println("No. Of Sub Strings : " + count1);
    }
}
