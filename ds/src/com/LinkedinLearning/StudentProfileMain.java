package com.LinkedinLearning;

public class StudentProfileMain {
    public static void main(String[] args) {
        StudentProfile student1 = new StudentProfile("Raj", "Singh", 2014, 4.8, "B.E.");
        StudentProfile student2 = new StudentProfile("Rajendra", "Sen", 2016, 3.4, "BSc");
        student1.showStudentProfile();
        student2.showStudentProfile();
    }
}