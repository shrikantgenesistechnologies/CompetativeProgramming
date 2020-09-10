package com.ListPackage;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> lap = new LinkedList();
        lap.add(new Laptop("Dell", 16, 60000));
        lap.add(new Laptop("Apple", 12, 1500000));
        lap.add(new Laptop("Huawei", 8, 120000));
        
//        System.out.print("You want to sort through ram/price : ");
//        Comparator<Laptop> com;
//        com = new Comparator<Laptop>(){
//            Scanner sc = new Scanner(System.in);
//            String val = sc.nextLine();
//            public int compare(Laptop lap1, Laptop lap2) {
//                int size = lap.size();
//                if(val.equals("price")) {
//                    if(lap1.getPrice() > lap2.getPrice()) {
//                        return 1;
//                    } else {
//                        return -1;
//                    }
//                } else if(val.equals("ram")) {
//                    if(lap1.getRam() > lap2.getRam()) {
//                        return 1;
//                    } else {
//                        return -1;
//                    }
//                } else if(val.equals("name")) {
////                  System.out.println("Hello : " + lap1.getBrand().getClass().getName()); //view variable type from these
//                    return lap1.getBrand().compareTo(lap2.getBrand());  
//                }
//                return 0;
//            }
//        };
        
//        Collections.sort(lap, com);  //When you use Comparator in Runner class
        Collections.sort(lap);  //When you implements Comparable in laptop class
        System.out.println("Your List : ");
//        Iterator it = lap.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        for (Laptop l : lap) {
            System.out.println(l);
        }
    }
}
