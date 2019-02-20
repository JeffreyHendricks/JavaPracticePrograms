/*
 * The purpose of this program is to take in an input
 * of three separate exercise titles, their point values
 * and the amount of points that an individual scored on
 * each of those. Then, using the DecimalFormat class we will
 * output the total value as a percentage.
 */
package gradetotalcalculation;

/**
 *
 * @author jeff
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeTotalCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#0.0#%");
        DecimalFormat otherFormat = new DecimalFormat("#0.0#");
        
        String exercise1, exercise2, exercise3;
        double score1, score2, score3, possible1, possible2, possible3, totalScore, totalPossible, totalPercent;
        
        System.out.println("Name of exercise 1: ");
        exercise1 = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Score received for exercise 1: ");
        score1 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Total points possible for exercise 1: ");
        possible1 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Name of exercise 2: ");
        exercise2 = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Score received for exercise 2: ");
        score2 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Total points possible for exercise 2: ");
        possible2 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Name of exercise 3: ");
        exercise3 = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Score received for exercise 3: ");
        score3 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Total points possible for exercise 3: ");
        possible3 = keyboard.nextDouble();
        keyboard.nextLine();
        
        totalScore = score1 + score2 + score3;
        totalPossible = possible1 + possible2 + possible3;
        totalPercent = totalScore/totalPossible;
        
        System.out.printf("%-30s %20s %20s %n", "Exercise", "Score", "Total Possible");
        System.out.printf("%-30s %20s %20s %n", exercise1, otherFormat.format(score1), otherFormat.format(possible1));
        System.out.printf("%-30s %20s %20s %n", exercise2, otherFormat.format(score2), otherFormat.format(possible2));
        System.out.printf("%-30s %20s %20s %n", exercise3, otherFormat.format(score3), otherFormat.format(possible3));
        System.out.printf("%30s %20s %20s %n", "Total", otherFormat.format(totalScore), otherFormat.format(totalPossible));
        System.out.println("You total is " + otherFormat.format(totalScore) + " out of " + otherFormat.format(totalPossible) + " or " + dFormat.format(totalPercent));
        
    }
    
}
