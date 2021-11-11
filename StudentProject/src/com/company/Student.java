package com.company;

public class Student {

    private String studentName;
    private RecordBook studentGrades;

    /*
    Constructor
    */
    public Student(String studentName, RecordBook studentGrades) {

        this.studentName = studentName;
        this.studentGrades = studentGrades;

    }
    /*
    Getters
    */
    public String getStudentName() {

        return studentName;

    }

    public RecordBook getStudentGrades() {

        return studentGrades;

    }
}
