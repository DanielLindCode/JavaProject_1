package com.company;

import java.util.ArrayList;

public class RecordCatalogue {

    public ArrayList<Student> students = new ArrayList<>();

    /*
    Method to add a student to the ArrayList
    */
    public void addStudent(Student student) {

        students.add(student);

    }

    /*
    Method to print all the students on the list.
    */
    public void printStudents() {

        Student student;

        for (int i = 0; i < students.size(); i++) {

            student = students.get(i);

            System.out.println(student.getStudentName());

        }

    }

    /*
    Method for finding the student you input.
    */
    public Student findStudent(String inputName) {

        Student student;

        for (int i = 0; i < students.size(); i++) {

            student = students.get(i);

            if (inputName.equals(student.getStudentName())) {

                return student;

            }
        }
        return null;
    }

}

