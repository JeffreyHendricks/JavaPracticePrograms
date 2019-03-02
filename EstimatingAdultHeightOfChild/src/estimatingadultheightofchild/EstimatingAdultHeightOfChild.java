/*
 * This program will estimate the future height of a child
 * using a formula and given their: Gender, mothers height 
 * and fathers height. It will take an input of height in inches
 * or feet and inches and produce an output of feet and inches.
 */
package estimatingadultheightofchild;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class EstimatingAdultHeightOfChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dFormat = new DecimalFormat("#0.00");
        int motherHeight = 0, motherHeightInches, fatherHeight = 0, fatherHeightInches;
        int childHeight = 0;
        String gender, inputChoice;
        int sentinelValue = 0;
        
        while(sentinelValue > -1)
        {
        System.out.println("Please start by entering the gender of the child using male or female: ");
        gender = keyboard.next();
        keyboard.nextLine();
        
        System.out.println("Please choose whether you would like to input the height of the parents in feet and inches (feet) or just inches: ");
        inputChoice = keyboard.next();
        keyboard.nextLine();
        
        if(inputChoice.equalsIgnoreCase("feet"))
        {
            System.out.println("Please enter the height of the mother in feet.");
            motherHeight = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.println("Please enter the remaining inches of height.");
            motherHeightInches = keyboard.nextInt();
            keyboard.nextLine();
            
            motherHeight = (motherHeight * 12) + motherHeightInches;
            
            System.out.println("Please enter the height of the father in feet and inches.");
            fatherHeight = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.println("Please enter the remaining inches of height.");
            fatherHeightInches = keyboard.nextInt();
            keyboard.nextLine();
            
            fatherHeight = (fatherHeight * 12) + fatherHeightInches;
        }
        else if(inputChoice.equalsIgnoreCase("inches"))
        {
            System.out.println("Please enter the height of the mother in inches");
            motherHeight = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.println("Please enter the height of the father in inches");
            fatherHeight = keyboard.nextInt();
            keyboard.nextLine();
        }
        
        int femaleChildHeight = ((fatherHeight * 12/13) + motherHeight)/2;
        int maleChildHeight = ((motherHeight * 13/12) + fatherHeight)/2;
        
        if(gender.equalsIgnoreCase("male"))
        {
            childHeight = maleChildHeight;
        }
        else if(gender.equalsIgnoreCase("female"))
        {
            childHeight = femaleChildHeight;
        }
        
        int childHeightFeet = (childHeight/12);
        int childHeightInches = (childHeight%12);
        
        
        System.out.println("The future height of the child in inches will be: " + childHeight + 
                            " inches and the height in feet and inches is: " + childHeightFeet + " feet and " + 
                              childHeightInches + " inches.");
        System.out.println();
        System.out.println("To continue please enter 1.");
        System.out.println("To exit please enter -1");
        sentinelValue = keyboard.nextInt();
        }
    }
    
}
