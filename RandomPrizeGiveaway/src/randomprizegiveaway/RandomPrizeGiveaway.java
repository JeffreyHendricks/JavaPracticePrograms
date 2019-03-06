/*
 * This program will make use of the random
 * generator class to give three prizes away to
 * 3 separate finalists out of 30 while making
 * sure that none of the finalists match each other
 * and there is no number outside of the 30 finalists
 */
package randomprizegiveaway;

/**
 *
 * @author jeff
 */
import java.util.Random;

public class RandomPrizeGiveaway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random newRandom = new Random();
        int finalists, f1, f2;
        int prize = 3;
        
        while(prize > 0)
        {
            finalists = newRandom.nextInt(31);
            f1 = finalists;
            finalists = newRandom.nextInt(31);
            f2 = finalists;
            finalists = newRandom.nextInt(31);
            System.out.println("The finalists are: " + f1 + " , " + f2 + " , " + finalists);
            
            if(f1 == f2 || f1 == finalists || f2 == finalists)
            {
                System.out.println("You cannot give a prize to the same person twice!");
            }
            else if(f1 != f2 && f1 != finalists && f2 != finalists)
            {
                System.out.println("Prize: " + prize + " goes to finalist number: " + finalists);
                prize--;
                System.out.println("Prize: " + prize + " goes to finalist number: " + f1);
                prize--;
                System.out.println("Prize: " + prize + " goes to finalist number: " + f2);
                prize--;
            }
        }
            
    }
    
}
