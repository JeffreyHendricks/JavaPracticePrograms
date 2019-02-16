/*
 * This program will take in an input for the initial
 * price of an item, the years it will be used and 
 * the salvage value of the item from the user using
 * the Scanner object. It will then output the yearly 
 * depreciation value of the items price.
 */
package straightlinedepreciationformula;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class StraightLineDepreciationFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        
        double itemPrice, yearsOfUse, salvageValue, depreciationValue;
        String itemName;
        
        System.out.println("Please enter the name of the item: ");
        itemName = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Please enter the price of the item: ");
        itemPrice = keyboard.nextDouble();
        keyboard.nextLine(); 
        
        System.out.println("How many years will the item be in use?: ");
        yearsOfUse = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("What is the salvage value of the item?: ");
        salvageValue = keyboard.nextDouble();
        keyboard.nextLine();
        
        depreciationValue = (itemPrice - salvageValue)/yearsOfUse;
        System.out.println("The item " + itemName + " with its price set at: " + moneyFormat.format(itemPrice));
        System.out.println("Being used for: " + yearsOfUse + " years and having a salvage value of: " + moneyFormat.format(salvageValue));
        System.out.println("Will depreciate in price by :" + moneyFormat.format(depreciationValue) + " each year.");
    }
    
}
