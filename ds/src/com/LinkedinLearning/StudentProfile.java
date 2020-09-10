package com.LinkedinLearning;

public class StudentProfile {
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;
    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = excpectedYear(expectedYearToGraduate);
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }
    public int excpectedYear(int year) {
        return year + 4;
    }
    public void showStudentProfile() {
        System.out.println("StudentProfile{ firstName = " + firstName + ", lastName = " + lastName + ", expectedYearToGraduate = " + expectedYearToGraduate + ", GPA = " + GPA + ", declaredMajor = " + declaredMajor + "}");
    }
}
