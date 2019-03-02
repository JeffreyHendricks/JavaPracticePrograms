/*
 * The purpose of this program is to simulate a game of craps 
 * as played by a computer only and then after a certain amount
 * of games played, the program will calculate the amount of times 
 * a player would win and lose then produce the probability of winning.
 */
package gameofcrapswinprobability;

/**
 *
 * @author jeff
 */

import java.text.DecimalFormat;
public class GameOfCrapsWinProbability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat dFormat = new DecimalFormat("##.##%");
        int die1, die2, comeOutRoll, pointNumber=0;
        int wins = 0, losses = 0, count = 0, sumOfRoll = 0, gameCount = 10000;  
        double probabilityOfWinning;
        
        while(gameCount > 0)
        {
            
            die1 = (int)(Math.random() * 6) + 1;
            die2 = (int)(Math.random() * 6) + 1;
            
            comeOutRoll = die1 + die2;
            
            System.out.println("The die numbers are: " + die1 + " and " + die2);
            System.out.println("The come out roll is: " + comeOutRoll);
            
            if(comeOutRoll == 7 || comeOutRoll == 11)
            {
                wins++;                 //Keeping track of the players win amount
                System.out.println("Congratulations, you have : " + wins + " wins.");
            }
            else if(comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12)
            {
                losses++;               //Keeping track of the players loss amount
                System.out.println("I'm sorry but you have : " + losses + " losses.");
            }
            else if(comeOutRoll == 4 || comeOutRoll == 5 || comeOutRoll == 6 || comeOutRoll == 8 || comeOutRoll == 9 || comeOutRoll == 10)
            {
                pointNumber = comeOutRoll;
                
                System.out.println("The point number is: " + pointNumber);
                
                die1 = (int)(Math.random() * 6) + 1;
                die2 = (int)(Math.random() * 6) + 1;
                sumOfRoll = die1 + die2;
                System.out.println("The sum is: " + sumOfRoll);
                
                while(sumOfRoll != 7 && sumOfRoll != pointNumber)
                {
                    die1 = (int)(Math.random() * 6) + 1;
                    die2 = (int)(Math.random() * 6) + 1;
                    sumOfRoll = die1 + die2;
                    System.out.println("Next roll is: " + sumOfRoll);
                }
                
                if(sumOfRoll == 7)
                {
                    losses++;
                    System.out.println("I am sorry but you have lost this one. You have: " + losses + " losses.");
                }
                else if(sumOfRoll == pointNumber)
                {
                    wins++;
                    System.out.println("Congrats on winning this one! You have: " + wins + " wins.");
                }
                
            }
            
            
            gameCount--;
            count++;
            
            System.out.println("Count is: " + count);
            System.out.println();
        }
        
        probabilityOfWinning = (double)wins/(double)(wins+losses);
         
        System.out.println("Your total wins are: " + wins);
        System.out.println("Your total losses are: " + losses);
        System.out.println("Probability of winning is: " + dFormat.format(probabilityOfWinning));
    }
    
    
}
