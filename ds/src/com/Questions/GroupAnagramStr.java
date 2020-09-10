package com.Questions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagramStr {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat", "toe"};
        Map<String, List<String>> map = new HashMap<>();
        for(String s: str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new LinkedList<String>());
            }
            map.get(sortedStr).add(s);
        }
        System.out.println("Result : " + map.values());
    }
}