/*
 * The purpose of this program is to show a basic understanding
 * of classes and to implement a class to hold a student record
 * that will include grades for quizzes and exams as well as a 
 * final grade and the accessor and mutator methods needed.
 */
package studentrecordprogram;

/**
 *
 * @author jeff
 */
public class StudentRecordProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentRecord s1 = new StudentRecord(10,10,10,100,100);
        StudentRecord s2 = new StudentRecord(9,9,9,90,90);
        StudentRecord s3 = new StudentRecord(8,7,7,75,70);
        StudentRecord s4 = new StudentRecord(0,5,4,60,60);
        StudentRecord s5 = new StudentRecord(9,9,9,90,90);
        StudentRecord s6 = new StudentRecord();
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        
        System.out.println(s5.equals(s2));
        
        s6.setQuiz1(10);
        s6.setQuiz2(9);
        s6.setQuiz3(6);
        s6.setMidterm(78);
        s6.setFinal(99);
        
        System.out.println(s6.getQuizScores());
        System.out.println(s6.getMidterm());
        System.out.println(s6.getFinal());
        
    }
    
}
