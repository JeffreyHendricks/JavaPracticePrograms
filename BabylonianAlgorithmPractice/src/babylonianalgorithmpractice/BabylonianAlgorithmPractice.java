/*
 * The purpose of this program is to practice using the 
 * printf, numberformatter and decimal formatter classes
 * In this example we will do this by using a babylonian
 * algorithm to find the square root of a number and output
 * it as a double with two decimal places.
 */
package babylonianalgorithmpractice;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BabylonianAlgorithmPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat doubleFormat = new DecimalFormat("##0.00");
        NumberFormat nFormat = NumberFormat.getCurrencyInstance();
        
        System.out.println("Please enter a number: ");
        double n = keyboard.nextDouble();
        keyboard.nextLine();
        
        double guess = n/2;
        
        for(int i = 0; i < 5; i++){
            
        double r = n/guess;
        guess = (guess + r)/2;
        System.out.println("Output as a double: " + doubleFormat.format(guess));
        System.out.println("Output as currency instead: " + nFormat.format(guess));
        
        }
        
    }
    
}
