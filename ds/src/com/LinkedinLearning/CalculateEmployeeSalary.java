package com.LinkedinLearning;

import java.util.Scanner;

public class CalculateEmployeeSalary {
    public static double calculateEmployeeSalaryPerYear(double workHourPerWeek, double moneyPerHour, int vacationDays) {
        double moneyPerWeek = workHourPerWeek * moneyPerHour;
        double unPaidTime = vacationDays * moneyPerHour * 8;
        return (moneyPerWeek * 52) - unPaidTime;
    }
    public static void main(String[] args) {
        System.out.println(calculateEmployeeSalaryPerYear(40, 15, 8));
    }
}
