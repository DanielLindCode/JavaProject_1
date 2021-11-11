package com.company;

import java.util.ArrayList;

public class RecordCatalogue {

    public ArrayList students = new ArrayList<Student>();

    /*
    Method to add a student to the ArrayList
    */
    public void addStudent(Student student) {

        students.add(student);

    }

    /*
    Method to print all the students on the list.
    Im using casting here to get Student objects from the Array.
    I want to use the .getStudentName.
    */
    public void printStudents() {

        Student student;

        for (int i = 0; i < students.size(); i++) {

            student = (Student) students.get(i);

            System.out.println(student.getStudentName());

        }

    }

    /*
    Method for finding the student you input.
    Using casting here too.
    */
    public Student findStudent(String inputName) {
        Student student;

        for (int i = 0; i < students.size(); i++) {

            student = (Student) students.get(i);

            if (inputName.equals(student.getStudentName())) {

                return student;

            }
        }
        return null;
    }

}

