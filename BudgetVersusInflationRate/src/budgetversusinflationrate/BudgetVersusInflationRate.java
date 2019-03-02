/*
 * This program will gauge the inflation rate of an item
 * over a specified amount of years. It will take an input
 * of the years to span over, the inflation rate as a percent,
 * and an items price.
 */
package budgetversusinflationrate;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class BudgetVersusInflationRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        
        double itemCost = 0, rateOfInflation = 0, inflationPrice = 0;
        int numberOfYears, count = 0;
        String itemName;
        
        System.out.println("Please enter the name of the item to be purchased: ");
        itemName = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Please enter the cost of the item: ");
        itemCost = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("How many years from now do you plan to purchase this item? :");
        numberOfYears = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Lastly, what is the rate of inflation as a percent (example '5.6':)");
        rateOfInflation = keyboard.nextDouble();
        keyboard.nextLine();
        
        rateOfInflation = rateOfInflation/100;
        
        for(int i = 0; i < numberOfYears; i++)
        {
            count++;
        inflationPrice += (rateOfInflation * numberOfYears);
        System.out.println("The inflation this year is: " + moneyFormatter.format(inflationPrice));
        System.out.println("For year: " + count + " the price is: ");
        double total = inflationPrice + itemCost;
        System.out.println(moneyFormatter.format(total));
        }
    }
    
}
