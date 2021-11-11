package com.company;

public class RecordBook {

    private int mathGrade;
    private int englishGrade;
    private int gymGrade;
    private int scienceGrade;

    public RecordBook(int mathGrade, int englishGrade, int gymGrade, int scienceGrade) {

        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.gymGrade = gymGrade;
        this.scienceGrade = scienceGrade;

    }

    public String allGrades() {
        return mathGrade + " " + englishGrade + " " + gymGrade + " " + scienceGrade;

    }
    public int averageGrade() {

        return (mathGrade + englishGrade + gymGrade + scienceGrade) / 4;

    }
    public int lowestGrade() {
        return Math.min(
                Math.min(mathGrade, englishGrade),
                Math.min(gymGrade, scienceGrade)
        );
    }
    public int highestGrade() {
        return Math.max(
                Math.max(mathGrade, englishGrade),
                Math.max(gymGrade, scienceGrade)
        );

    }


}
