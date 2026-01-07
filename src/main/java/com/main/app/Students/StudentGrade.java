package com.main.app.Students;

public class StudentGrade extends Student {
    private int midtermGrade;
    private int finalGrade;

    StudentGrade(String name, int id, int midterm, int finalGrade) {
        super(name, id); // initialize parent class
        this.midtermGrade = midterm;
        this.finalGrade = finalGrade;
    }

    public int getMidtermGrade() { return midtermGrade; }
    public int getFinalGrade() { return finalGrade; }
    public int getAverage() {
        return (midtermGrade + finalGrade) / 2; // simple average
    }

    public void setMidtermGrade(int midtermGrade) { this.midtermGrade = midtermGrade; }
    public void setFinalGrade(int finalGrade) { this.finalGrade = finalGrade; }
}