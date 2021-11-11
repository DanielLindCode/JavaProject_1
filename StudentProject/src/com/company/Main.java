package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Reads in file
         */
        File listOfStudents = new File("/Users/lindb/IdeaProjects/StudentProject/src/com/company/Students.txt");
        Scanner scan = new Scanner(listOfStudents);

        /*
        Creates the catalogue
         */
        RecordCatalogue catalogue = new RecordCatalogue();

        /*
        Declare two Strings for first and second line in the text file
         */
        String studentName, studentGradeString;

        /*
        Creates a StringArray
         */
        String[] splitString;

        /*
        Reads in name and grades, puts grades into a list and declare them as Integers.
        Creates a new Recordbook
        creates and puts a student into the Array
        */
        while (scan.hasNextLine()) {

            studentName = scan.nextLine();
            studentGradeString = scan.nextLine();
            splitString = studentGradeString.split(":");

            RecordBook grades = new RecordBook(
                    Integer.parseInt(splitString[0]), Integer.parseInt(splitString[1]),
                    Integer.parseInt(splitString[2]), Integer.parseInt(splitString[3])
            );

            catalogue.addStudent(new Student(studentName, grades));

        }

        /*
        Prints all the students
        */
        System.out.println("Avaiable Students:");

        catalogue.printStudents();

        /*
        Asks for input and create a scanner to read the input.
        Declare the input to a String.
        */
        System.out.println("Which student do you want to look at?");

        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();

        /*
        Uses the method to find the student in the list.
        */
        Student currentStudent = catalogue.findStudent(inputName);

        /*
        If you type wrong name.
        */
        if (currentStudent == null) {

            System.out.println("Sorry, cant find a student with that name. ");
            System.out.println("Please try again ");

        } else {

            /*
            Print chosen student and students grades.
            Gives the options
            */
            while (true) {

                System.out.println(currentStudent.getStudentName());
                System.out.println(currentStudent.getStudentGrades().allGrades());
                System.out.println("Options: ");
                System.out.println("============================== ");
                System.out.println("1. Highest Grade ");
                System.out.println("2. Lowest Grade ");
                System.out.println("3. Average Grade ");
                System.out.println("4. Exit ");

            /*
            Creates input scanner
            Declare the input to a String
            */
                Scanner optionScanner = new Scanner(System.in);
                String choice = optionScanner.nextLine();

            /*
            Compair the input and print the option chosen.
            */

                if (choice.equals("1")) {

                    System.out.println("============================== ");
                    System.out.println("Highest Grade: " + currentStudent.getStudentGrades().highestGrade());
                    System.out.println("============================== ");

                } else if (choice.equals("2")) {

                    System.out.println("============================== ");
                    System.out.println("Lowest Grade: " + currentStudent.getStudentGrades().lowestGrade());
                    System.out.println("============================== ");

                } else if (choice.equals("3")) {

                    System.out.println("============================== ");
                    System.out.println("Average Grade: " + currentStudent.getStudentGrades().averageGrade());
                    System.out.println("============================== ");

                } else if (choice.equals("4")) {

                    System.out.println("============================== ");
                    System.out.println("Good Bye");
                    System.out.println("============================== ");
                    break;
                } else {

                    System.out.println("Please choose a correct option. ");
                }
            }


        }


    }
}
