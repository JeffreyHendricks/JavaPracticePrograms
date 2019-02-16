/*
 * This program will take in a users input for an items price
 * using increments of 5 cents it will then take in a dollar 
 * and calculate the amount of change the user should be given back
 * telling them the amount of quarters, dimes and nickels they will be given.
 */
package vendingmachinechange;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class VendingMachineChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        DecimalFormat dFormat = new DecimalFormat("##0.00");
        
        double itemPrice, dollar = 1.00, changeAmount;
       
        System.out.println("Please enter the price of the item you want to purchase starting from 25 cents to a dollar in increments of 5 : ");
        itemPrice = keyboard.nextDouble();
        keyboard.nextLine();
        
        changeAmount = dollar - itemPrice;
        String quarters = "";
        String dimes = "";
        String nickels = "";
        
        if(changeAmount < .06 && changeAmount > .04)
        {
            quarters = "0 Quarters";
            dimes = "0 dimes";
            nickels = "1 nickel";
        }
        else if(changeAmount < .11 && changeAmount > .09)
        {
            quarters = "0 Quarters";
            dimes = "1 dime";
            nickels = "0 nickels";
        }
        else if(changeAmount < .16 && changeAmount > .14)
        {
            quarters = "0 Quarters";
            dimes = "1 dime";
            nickels = "1 nickel";
        }
        else if(changeAmount < .21 && changeAmount > .19)
        {
            quarters = "0 Quarters";
            dimes = "2 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .26 && changeAmount > .24)
        {
            quarters = "1 Quarter";
            dimes = "0 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .31 && changeAmount > .29)
        {
            quarters = "1 Quarter";
            dimes = "0 dimes";
            nickels = "1 nickel";
        }
        else if(changeAmount < .36 && changeAmount > .34)
        {
            quarters = "1 Quarter";
            dimes = "1 dime";
            nickels = "0 nickels";
        }
        else if(changeAmount < .41 && changeAmount > .39)
        {
            quarters = "1 Quarter";
            dimes = "1 dime";
            nickels = "1 nickel";
        }
        else if(changeAmount < .46 && changeAmount > .44)
        {
            quarters = "1 Quarter";
            dimes = "2 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .51 && changeAmount > .49)
        {
            quarters = "2 Quarters";
            dimes = "0 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .56 && changeAmount > .54)
        {
            quarters = "2 Quarters";
            dimes = " 0 dimes";
            nickels = "1 nickel";
        }
        else if(changeAmount < .61 && changeAmount > .59)
        {
            quarters = "2 Quarters";
            dimes = "1 dime";
            nickels = "0 nickels";
        }
        else if(changeAmount < .66 && changeAmount > .64)
        {
            quarters = "2 Quarters";
            dimes = "1 dime";
            nickels = "1 nickel";
        }
        else if(changeAmount < .71 && changeAmount > .69)
        {
            quarters = "2 Quarters";
            dimes = "2 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .76 && changeAmount > .74)
        {
            quarters = "3 Quarters";
            dimes = "0 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount < .81 && changeAmount > .79)
        {
            quarters = "3 Quarters";
            dimes = "0 dimes";
            nickels = "1 nickel";
        }
        else if(changeAmount < .86 && changeAmount > .84)
        {
            quarters = "3 Quarters";
            dimes = "1 dime";
            nickels = "0 nickels";
        }
        else if(changeAmount < .91 && changeAmount > .89)
        {
            quarters = "3 Quarters";
            dimes = "1 dime";
            nickels = "1 nickel";
        }
        else if(changeAmount < .96 && changeAmount > .94)
        {
            quarters = "3 Quarters";
            dimes = "2 dimes";
            nickels = "0 nickels";
        }
        else if(changeAmount == 1.00)
        {
            quarters = "4 Quarters";
            dimes = "0 dimes";
            nickels = "0 nickels";
        }
        
        System.out.println("You bought an item for : " + moneyFormat.format(itemPrice) + " cents and gave me a dollar.");
        System.out.println("So your change will be: ");
        System.out.println(moneyFormat.format(changeAmount) + " Or ");
        System.out.println(quarters + "\n" + dimes + "\n" + nickels);
        
        
    }
    
}
