package com.MapPackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap();
        m.put(1, "Sourabh");
        m.put(2, "Sona");
        m.put(3, "Sobha");
        m.put(4, "Abha");
        m.put(5, "Sonam");
        m.put(6, "Barkha");
        System.out.println("MapList : " + m.values());
    }
}
