package com.Questions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};//{1, 4, 4, 4, 5, 3};
        int count=0;
        Map<Integer, Integer> map = new HashMap();
        Arrays.sort(arr);
        System.out.println("Array : ");
        for(int j:arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
        for(int i: arr) {
            if(!map.containsKey(i)) {
                count = 1;
                map.put(i,count);
            } else {
                map.put(i,++count);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
        System.out.println("Result : " + map.toString());
    }
}
