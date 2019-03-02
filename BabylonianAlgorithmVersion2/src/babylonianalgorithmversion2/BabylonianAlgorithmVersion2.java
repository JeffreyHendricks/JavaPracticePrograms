/*
 * The purpose of this version of the Babylonian Algorithm program
 * is to allow for the algorithm to continue going until the guess
 * is within 1% of the previous guess made. This will let the program
 * keep working until it reaches a final square root instead of only
 * working off of the few iterations given in a for loop
 */
package babylonianalgorithmversion2;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BabylonianAlgorithmVersion2 {

    /**
     * @param args the command line arguments
     */
    public static final double ONE_PERCENT = 0.01;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dFormatter = new DecimalFormat("#0.00");
        
        double n, guess, r;
        
        System.out.println("Please enter the number you wish to know the square root of: ");
        
        n = keyboard.nextDouble();
        keyboard.nextLine();
        
        guess = n/2;
        
        r = n/guess;
        
        while((guess - r) > ONE_PERCENT)
        {
            r = n/guess;
            guess = (guess + r)/2;
            System.out.println("The square root of the number: " + n + " is: " + dFormatter.format(guess));
        }
    }
    
}
