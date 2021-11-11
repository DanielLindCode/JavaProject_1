package com.company;

public class RecordBook {

    private int mathGrade;
    private int englishGrade;
    private int gymGrade;
    private int scienceGrade;

/*
Constructor
 */
    public RecordBook(int mathGrade, int englishGrade, int gymGrade, int scienceGrade) {

        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.gymGrade = gymGrade;
        this.scienceGrade = scienceGrade;

    }
    /*
    Gets the sum of all grades
    */
    public String allGrades() {

        return mathGrade + " " + englishGrade + " " + gymGrade + " " + scienceGrade;

    }
    /*
    Calculates average grade
    */
    public int averageGrade() {

        return (mathGrade + englishGrade + gymGrade + scienceGrade) / 4;

    }
    /*
    I use math.min to get the lowest grade
    */
    public int lowestGrade() {

        return Math.min(
                Math.min(mathGrade, englishGrade),
                Math.min(gymGrade, scienceGrade)
        );
    }
    /*
    I use math.max to get the highest grade
    */
    public int highestGrade() {

        return Math.max(
                Math.max(mathGrade, englishGrade),
                Math.max(gymGrade, scienceGrade)
        );

    }


}
