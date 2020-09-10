package com.Questions;
import java.util.Scanner;

public class DayOfProgrammer {
    static String leapyear(int year) {
//        boolean leap = false;
//        if(year % 4 == 0) {
//            if( year % 100 == 0) {
//                if ( year % 400 == 0) leap = true;
//                else leap = false;
//            } else leap = true;
//        } else leap = false;
//        System.out.println(leap + " " + year);
//        return leap;
        if(year == 1918) return "26.09.1918";
        else if((year < 1918 && year%4 == 0) || (year > 1918  && (year%4 == 0 && year%100 != 0 || year%400 == 0))) return "12.09." + year;
        else return "13.09." + year;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int day = 256;
        System.out.println("Result : " + leapyear(year));
//        if(leapyear(year)) day = 256 - 244;
//        else day = 256 - 243;
//        System.out.println(day + ".09." + year);
    }
}
