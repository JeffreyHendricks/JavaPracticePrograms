/*
 * This program will be a better version of the caffeine overdose 
 * program that tells the user how many cups of coffee or soda
 * they can drink without overdosing on caffeine. It will read in
 * the information from a text file instead of the user inputting
 * the information themselves.
 */
package caffeineoverdoseversion2;

/**
 *
 * @author jeff
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class CaffeineOverdoseVersion2 {

    /**
     * @param args the command line arguments
     */
    
    public static final double MAX_MILLIGRAMS = 10000;
    public static final double SODA_CAFFEINE_AMOUNT = 34;
    public static final double COFFEE_CAFFEINE_AMOUNT = 160;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double sodaOverdose, coffeeOverdose;
        String soda, coffee;
        Scanner fileIn = null;
        DecimalFormat dFormat = new DecimalFormat("#0.0#");
        
        try
        {
        fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\fourthLine.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        
        System.out.println("File has next line to read? " + fileIn.hasNextLine());
        System.out.println("The name of the first beverage is: ");
        soda = fileIn.nextLine();
        System.out.println(soda);
        
        sodaOverdose = (MAX_MILLIGRAMS/SODA_CAFFEINE_AMOUNT);
        System.out.println("You can drink approximately: " + dFormat.format(sodaOverdose) + " sodas before it becomes lethal.");
        fileIn.nextLine();
        
        System.out.println("File has next line to read? " + fileIn.hasNextLine());
        System.out.println("The name of the second beverage is: ");
        coffee = fileIn.nextLine();
        System.out.println(coffee);
        
        coffeeOverdose = (MAX_MILLIGRAMS/COFFEE_CAFFEINE_AMOUNT);
        System.out.println("You can drink approximately: " + dFormat.format(coffeeOverdose) + " cups of coffee before it becomes lethal.");
        fileIn.close();
    }
    
}
