package com.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ActiveTraders {
    public static void main(String[] args) {
        List<String> c = new ArrayList();
        List<String> st = new ArrayList();
        c.add("Alpha");c.add("Omega");c.add("Alpha");c.add("Omega");c.add("Alpha");c.add("Omega");c.add("Alpha");
        c.add("Omega");c.add("Alpha");c.add("Omega");c.add("Alpha");c.add("Omega");c.add("Alpha");c.add("Omega");
        c.add("Alpha");c.add("Omega");c.add("Alpha");c.add("Omega");c.add("Omega");c.add("Beta");
        Map<String, Integer> map = new LinkedHashMap();
        Collections.sort(c);
        int count = 0;
        for (String str : c) {
            if(!map.containsKey(str)){
                count = 0;
                map.put(str, ++count);
            } else {
                map.put(str, ++count);
            }
        }
        System.out.println("map : " + map.toString());
        map.entrySet().forEach(entry->{
            float per = Math.round((100/c.size()) * entry.getValue());
            if(per > 4.99f) {
                st.add(entry.getKey());
            }
        });
        Collections.sort(st);
        Iterator it = st.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
