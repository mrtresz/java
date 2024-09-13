package com.cwephetionalsoftwareservices.main;

import com.cwephetionalsoftwareservices.dao.Student;
import com.cwephetionalsoftwareservices.dao.StudentDAO;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new Student();


        System.out.println("Welcome to student management system");
        while(true) {
            System.out.println(
                    "\n1.Add Student" +
                    "\n2.Show All Students" +
                    "\n3.Get student based on roll number"+
                    "\n4.Delete Student" +
                    "\n5.Update Student" +
                    "\n6.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1 -> {
                    System.out.println("Enter student name");
                    String name = sc.nextLine();
                    System.out.println("Enter student college name");
                    String college = sc.nextLine();
                    System.out.println("Enter roll number");
                    int roll = sc.nextInt();
                    System.out.println("Enter student percentage");
                    double percentage = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter student city");
                    String city = sc.nextLine();

                    com.cwephetionalsoftwareservices.model.Student student = new com.cwephetionalsoftwareservices.model.Student(percentage,city,college,name, roll);
                    boolean ans = dao.addStudent(student);
                    if(ans) {
                        System.out.println("Student added successfully");
                    }else{
                        System.out.println("Student not added successfully");
                    }
                }
                case 2 -> {
                    dao.showAllStudents();
                }
                case 3 -> {
                    System.out.println("Enter student roll number");
                    int roll = sc.nextInt();
                    boolean f = dao.showStudentById(roll);

                    if(!f) {
                        System.out.println("Student with this roll number is not in the database");
                    }
                }
                case 4 -> {
                    System.out.println("Enter roll number");
                    int roll = sc.nextInt();
                    boolean f = dao.deleteStudent(roll);
                    if(f) {
                        System.out.println("Student with this roll number is deleted successfully");
                    }else{
                        System.out.println("Something went wrong");
                    }
                }
                case 5 -> {

//                    System.out.println("""
//                            \s
//                            1.Update name
//                            2.Update college name
//                            3.Update city"""
//                    );
//                    System.out.println("Enter your choice");
//                    int choice1 = sc.nextInt();
//                    if (choice1 == 1) {
//                        System.out.println("Enter student roll number");
//                        int roll1 = sc.nextInt();
//                        System.out.println("Enter new name");
//                        String newName = sc.nextLine();
//                        Student student = new Student();
//                        student.setName(newName);
//                        boolean f = dao.updateStudent(roll1, newName);
//                    }
                }
                case 6 ->{
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }



    }
}
