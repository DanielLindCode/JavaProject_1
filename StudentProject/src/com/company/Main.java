package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File listOfStudents = new File("/Users/lindb/IdeaProjects/StudentProject/src/com/company/Students.txt");
        Scanner scan = new Scanner(listOfStudents);

        RecordCatalogue catalogue = new RecordCatalogue();

        String studentName, studentGradeString;

        String[] splitString;


        while (scan.hasNextLine()) {
            // System.out.println(scan.nextLine());
            studentName = scan.nextLine();
            studentGradeString = scan.nextLine();
            splitString = studentGradeString.split(":");

            RecordBook grades = new RecordBook(
                    Integer.parseInt(splitString[0]), Integer.parseInt(splitString[1]),
                    Integer.parseInt(splitString[2]), Integer.parseInt(splitString[3])
            );

            catalogue.addStudent(new Student(studentName, grades));

        }


        System.out.println("Avaiable Students:");
        catalogue.printStudents();

        System.out.println("Which student do you want to look at?");

        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();

        Student currentStudent = catalogue.findStudent(inputName);


        if (currentStudent == null) {

            System.out.println("Sorry, cant find a student with that name. ");
            System.out.println("Please try again ");

        } else {


            System.out.println(currentStudent.getStudentName());
            System.out.println(currentStudent.getStudentGrades().allGrades());
            System.out.println("Choose an option: ");
            System.out.println("1. Highest Grade ");
            System.out.println("2. Lowest Grade ");
            System.out.println("3. Average Grade ");
            System.out.println("4. Exit ");

            Scanner optionScanner = new Scanner(System.in);

            if (optionScanner.nextLine().equals("1")) {
                System.out.println("Highest grade: " + currentStudent.getStudentGrades().highestGrade());
            } else if (optionScanner.nextLine().equals("2")) {
                System.out.println("ost");
                System.out.println("Lowest grade: " + currentStudent.getStudentGrades().lowestGrade());
            } else if (optionScanner.nextLine().equals("3")) {
                System.out.println("Average grade: " + currentStudent.getStudentGrades().averageGrade());
            } else if (optionScanner.nextLine().equals("4")) {
                System.out.println("Good bye");
            } else {
                System.out.println("Please choose a correct option. ");
            }


        }


    }
}
