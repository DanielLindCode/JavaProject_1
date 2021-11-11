package com.company;

import java.util.ArrayList;

public class RecordCatalogue {

    ArrayList students = new ArrayList<Student>();

    public void addStudent(Student student) {

        students.add(student);

    }

    public void printStudents() {

        Student student;

        for (int i = 0; i < students.size(); i++) {

            student = (Student) students.get(i);

            System.out.println(student.getStudentName());

        }

    }

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

