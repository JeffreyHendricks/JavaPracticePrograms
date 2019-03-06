/*
 * This is a sample program of a game of Pig
 * against a computer. The rules are simple,
 * first to reach a total of 100 points wins,
 * players can roll again or hold, a roll of 1
 * ends the players turn and they get no points
 * for that turn. The computer will roll until it
 * accumulates a total of 20 points a turn or rolls a 1.
 */
package gameofpig;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
public class GameOfPig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int die;
        int turn = 2;
        int player1Total=0;
        int player1Accumulation = 0;
        int computerTotal=0;
        int computerAccumulation = 0;
        String roll;
        
        System.out.println("Player one rolls first.");
        while(player1Total < 100 || computerTotal < 100)
        {
            if(turn%2 == 0 && player1Total < 100)
        {
            die = (int)(Math.random() * 6) + 1;
            System.out.println("The first roll is: " + die);
            player1Accumulation = die + player1Accumulation;
            System.out.println("Would you like to keep rolling? Enter 'r' to roll again or 'h' to stay.");
            roll = keyboard.next();
            keyboard.nextLine();
            
            while(die > 1 && roll.equalsIgnoreCase("r"))
            {
                die = (int)(Math.random() * 6) + 1;
                player1Accumulation = die + player1Accumulation;
                System.out.println("Roll is: " + die);
                System.out.println("Total accumulation for player1 is: " + player1Accumulation);
                System.out.println("ComputerTotal is: " + computerTotal);
                System.out.println("Would you like to keep rolling?");
                roll = keyboard.next();
                keyboard.nextLine();
                
                if(die == 1)
                {
                    player1Accumulation = 0;
                    System.out.println("You rolled a one!");
                    System.out.println("Player ones total right now is: " + player1Total);
                    System.out.println("Player ones turn ended.");
                    turn++;
                }   
            }
            if(roll.equalsIgnoreCase("h"))
                {
                    player1Total = player1Total + player1Accumulation;
                    player1Accumulation = 0;
                    System.out.println("Player ones total right now is: " + player1Total);
                    
                    System.out.println("Player ones turn ended.");
                    turn++;
                }
            }
        
        while(turn%2 != 0 && computerTotal < 100)
        {
            die = (int)(Math.random() * 6) + 1;
            computerAccumulation = die + computerAccumulation;
            
            if(die > 1 && computerAccumulation < 20)
            {
                computerAccumulation = die + computerAccumulation;
            }
            else if(die > 1 && computerAccumulation >= 20)
            {
                computerTotal = computerTotal + computerAccumulation;
                System.out.println("Computer total: " + computerTotal);
                turn++;
            }
            else if(die == 1 || computerAccumulation >= 20)
            {
                computerAccumulation = 0;
                System.out.println("Computers turn ended.");
                turn++;
            }
        }
        
        if(player1Total >= 100)
        {
            System.out.println("PlayerOne wins!");
            System.exit(0);
            
        }
        else if(computerTotal >= 100)
        {
            System.out.println("Computer wins!");
            System.exit(0);
        }
    }
        
        }
}
