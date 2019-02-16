/*
 * The purpose of this program is to calculate the cost
 * of a commute to work knowing the distance in miles, 
 * the vehicles gas consumption rate (mpg), and the price
 * of gas in the area. These will all be entered by the user 
 * using the Scanner object and each will be output using
 * the appropriate format.
 */
package automobilecommutingprice;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AutomobileCommutingPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#0.0#");
        NumberFormat nFormat = NumberFormat.getCurrencyInstance();
        
        double milesTravelled, gasConsumption;
        double gasPrice;
        
        System.out.println("Please enter the total miles of your commute: ");
        milesTravelled = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Please enter the vehicles gas consumption rate (mpg): ");
        gasConsumption = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Now please enter the prce of the gasoline in your area as a double: ");
        gasPrice = keyboard.nextDouble();
        keyboard.nextLine();
        
        double totalCost = (milesTravelled/gasConsumption) * gasPrice;
                
        System.out.println("Miles travelled: " + dFormat.format(milesTravelled));
        System.out.println("With a car that consumes: " + dFormat.format(gasConsumption) + " MPG and");
        System.out.println("Gas prices being: " + nFormat.format(gasPrice));
        System.out.println("The total cost of your commute each day will be: " + nFormat.format(totalCost));
        
        
    }
    
}
