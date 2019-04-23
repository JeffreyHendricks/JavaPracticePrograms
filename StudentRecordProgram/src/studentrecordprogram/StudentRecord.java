/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecordprogram;

/**
 *
 * @author jeff
 */
public class StudentRecord {
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int finalExam;
    private final double TOTAL_SCORE_ALLOWED = 230;
    private double overallNumericScore;
    private String finalGrade;
    
    public StudentRecord()
    {
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finalExam = 0;
    }
    
    public StudentRecord(int q1, int q2, int q3, int m, int f)
    {
        quiz1 = q1;
        quiz2 = q2;
        quiz3 = q3;
        midterm = m;
        finalExam = f;
        computeOverallNumericScore();
        computeGrade();
    }
    
    public String getQuizScores()
    {
        return("Quiz 1: " + quiz1 + "\nQuiz 2: " + quiz2 + "\nQuiz 3: " + quiz3);
    }
    
    public String getMidterm()
    {
        return("Midterm: " + midterm);
    }
    
    public String getFinal()
    {
        return("Final: " + finalExam);
    }
    
    public void setQuiz1(int q)
    {
        quiz1 = q;
    }
    
    public void setQuiz2(int q2)
    {
        quiz2 = q2;
    }
    
    public void setQuiz3(int q3)
    {
        quiz3 = q3;
    }
    
    public void setMidterm(int m)
    {
        midterm = m;
    }
    
    public void setFinal(int f)
    {
        finalExam = f;
    }
    
    public String toString()
    {
        return("The quiz scores are: " + "\n" + quiz1 + "\n" + quiz2 + "\n" + quiz3 + "\nThe midterm score is: " 
                + midterm + "\nThe final exam score is: " + finalExam + "\nThe overall numeric score is: " +
                overallNumericScore + "\nThe final grade is: " + finalGrade);
    }
    
    public boolean equals(StudentRecord otherStudentRecord)
    {
        return(quiz1 == (otherStudentRecord.quiz1) && quiz2 == (otherStudentRecord.quiz2) &&
                quiz3 == (otherStudentRecord.quiz3) && midterm == (otherStudentRecord.midterm) &&
                finalExam == (otherStudentRecord.finalExam) && 
                overallNumericScore == (otherStudentRecord.overallNumericScore) &&
                finalGrade.equals(otherStudentRecord.finalGrade));
    }
    
    private void computeOverallNumericScore()
    {
        overallNumericScore = (((quiz1 + quiz2 + quiz3) + midterm + finalExam)/TOTAL_SCORE_ALLOWED)*100;
    }
    
    private void computeGrade()
    {
       if(overallNumericScore >= 90)
       {
           finalGrade = "A";
       }
       else if(overallNumericScore >= 80 && overallNumericScore < 90)
       {
           finalGrade = "B";
       }
       else if(overallNumericScore >= 70 && overallNumericScore < 80)
       {
           finalGrade = "C";
       }
       else if(overallNumericScore >= 60 && overallNumericScore < 70)
       {
           finalGrade = "D";
       }
       else if(overallNumericScore < 60)
       {
           finalGrade = "F";
       }
    }
}
