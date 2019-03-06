/*
 * This program is similar to the grade calculations program.
 * It will take an input for the amount of classroom exercises
 * from the user and then an input for the scores of each of
 * the exercises. It will then output the average score for
 * the student.
 */
package totalgradeclassroomexercises;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalGradeClassRoomExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#0.0#%");
        int classExercises, studentPoints = 0, pointsAvailable = 0, totalPoints = 0, totalStudentPoints = 0, count;
        double averageScore;
        String exerciseName;
        
        System.out.println("Please enter the amount of classroom exercises you want to score: ");
        classExercises = keyboard.nextInt();
        keyboard.nextLine();
        
        for(count = 1; count <= classExercises; count++)
        {
            System.out.println("What is the name of exercise " + count + ": ");
            exerciseName = keyboard.next();
            keyboard.nextLine();
            
            System.out.println("What is the score for exercise " + count + ": ");
            studentPoints = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.println("What is the total points available for exercise " + count + ": ");
            pointsAvailable = keyboard.nextInt();
            keyboard.nextLine();
            
            totalPoints = totalPoints + pointsAvailable;
            totalStudentPoints = totalStudentPoints + studentPoints;
        }
        
            averageScore = (double)totalStudentPoints/(double)totalPoints;
         
            System.out.println("The total amount of the points avalable for the combined exercises is: ");
            System.out.println(totalPoints);
            System.out.println();
            System.out.println("The total score for the students combined exercises is: ");
            System.out.println(totalStudentPoints);
            System.out.println();
            System.out.println("The average of the students scores is: " + dFormat.format(averageScore));
    }
    
}
