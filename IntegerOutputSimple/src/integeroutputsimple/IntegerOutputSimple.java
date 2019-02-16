/*
 * This is a simple program to show the output of the
 * sum, difference and product of two integers entered in
 * using the Scanner object
 */
package integeroutputsimple;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
public class IntegerOutputSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Please enter a whole number for n1: ");
        n1 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Please enter a whole number for n2: ");
        n2= keyboard.nextInt();
        keyboard.nextLine();
        
        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
    }
    
}
