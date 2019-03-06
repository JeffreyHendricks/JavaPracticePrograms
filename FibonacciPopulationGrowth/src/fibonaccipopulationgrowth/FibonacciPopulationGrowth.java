/*
 * This programs purpose is to make use of the Fibonacci
 * number sequence and observe the growth rate of a population
 * of green crud where there is no population death. The basic
 * purpose of this program is to get comfortable using loops.
 */
package fibonaccipopulationgrowth;

/**
 *
 * @author jeff
 */
import java.util.Scanner;

public class FibonacciPopulationGrowth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int initialSizeOfCrud;
        int numberOfDays;
        int f2 = 0;
        int number = 0;
        int count = 0;
        
        System.out.println("Please enter the initial size of the green crud as a whole number(in pounds): ");
        initialSizeOfCrud = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Please enter the number of days to allow for growth: ");
        numberOfDays = keyboard.nextInt();
        keyboard.nextLine();
        
       while(number <= 4 && number >= 0)
        {
            number++;
            
            if(number == 5)
            {
                
                for(int i = 1; i <= numberOfDays; i++)
                {
                    System.out.println("Number of day: " + count);
                    System.out.println(f2 + " + ");
                    
                int sum = f2 + initialSizeOfCrud;
                f2 = initialSizeOfCrud;
                initialSizeOfCrud = sum;
                
                count += number;
                }
                System.out.println("If you would like to continue please enter 0. To exit enter -1.");
            number = keyboard.nextInt();
            }
            
        }
       
        
    }
    
}
