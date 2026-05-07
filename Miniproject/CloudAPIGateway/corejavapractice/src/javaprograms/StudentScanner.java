package javaprograms;

import java.util.Scanner;

public class StudentScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student:");
        int age = sc.nextInt();
        System.out.println("Enter the grade of the student:");
        double grade = sc.nextDouble();
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
