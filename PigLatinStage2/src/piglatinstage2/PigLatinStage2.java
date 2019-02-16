/*
 * This is the same program as PigLatinString with one
 * simple addition, using the Scanner object to ask the
 * user to input the name instead of having it saved to
 * a variable.
 */
package piglatinstage2;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
public class PigLatinStage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your first name: ");
        String first = keyboard.next().toLowerCase();
        
        System.out.println("Please enter your last name as well: ");
        String last = keyboard.next().toLowerCase();
        
        String firstLetter = first.substring(0,1);
        firstLetter = firstLetter + "ay";
        String newFirst = first.substring(1,2).toUpperCase();
        first = newFirst + first.substring(2) + firstLetter;
        
        String lastLetter = last.substring(0,1);
        lastLetter = lastLetter + "ay";
        String newLast = last.substring(1,2).toUpperCase();
        last = newLast+ last.substring(2) + lastLetter;
        
        System.out.println("Your name in piglatin is: " + first + " " + last);
        
        
    }
    
}
