/*
 * This programs purpose is to simulate a register at a store
 * and to print out a receipt/bill to the user. The user is 
 * asked to input their items name, the quantity and price.
 * Using the Scanner object and Decimal and Number formats
 * the receipt will output the results with a tax rate of 6.25%
 */
package registerandreceipt;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class RegisterAndReceipt {

    /**
     * @param args the command line arguments
     */
    public static final double TAX_RATE = 6.25;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        DecimalFormat dForm = new DecimalFormat("#0.00");
        
        String itemOne, itemTwo, itemThree;
        int quantityOne, quantityTwo, quantityThree;
        double priceOne, priceTwo, priceThree, totalOne, totalTwo, totalThree, subTotal, salesTax, grandTotal;
        
        System.out.println("Input the name of item 1: ");
        itemOne = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Input quantity of item 1: ");
        quantityOne = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Input price of item 1: ");
        priceOne = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Input the name of item 2: ");
        itemTwo = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Input the quantity of item 2: ");
        quantityTwo = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Input the price of item 2: ");
        priceTwo = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Input the name of item 3: ");
        itemThree = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Input the quantity of item 3: ");
        quantityThree = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Input the price of item 3: ");
        priceThree = keyboard.nextDouble();
        keyboard.nextLine();
        
        totalOne = quantityOne * priceOne;
        totalTwo = quantityTwo * priceTwo;
        totalThree = quantityThree * priceThree;
        subTotal = totalOne + totalTwo + totalThree;
        salesTax = subTotal/TAX_RATE;
        grandTotal = subTotal + salesTax; 
        
        System.out.println("Your bill: \n");
        
        System.out.printf("%-30s %10s %10s %10s %n", "Item", "Quantity", "Price", "Total");
        System.out.printf("%-30s %10d %10s %10s %n", itemOne, quantityOne, dForm.format(priceOne), moneyFormatter.format(totalOne));
        System.out.printf("%-30s %10d %10s %10s %n", itemTwo, quantityTwo, dForm.format(priceTwo), moneyFormatter.format(totalTwo));
        System.out.printf("%-30s %10d %10s %10s %n", itemThree, quantityThree, dForm.format(priceThree), moneyFormatter.format(totalThree));
        System.out.printf("%-52s %10s %n", "SubTotal", moneyFormatter.format(subTotal));
        System.out.printf("%-51s %10s %n", "6.25% sales tax", moneyFormatter.format(salesTax));
        System.out.printf("%-52s %10s %n", "Grand Total", moneyFormatter.format(grandTotal));
    }
    
}
