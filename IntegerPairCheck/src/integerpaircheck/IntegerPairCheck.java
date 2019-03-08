/*
 * The purpose of this program is to read in
 * a number from the user and all integers from
 * a separate text file and check to see if any pair
 * of the integers from the file can add up to the integer
 * entered from the user.
 */
package integerpaircheck;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IntegerPairCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileIn = null;
        Scanner keyboard = new Scanner(System.in);
        int number;
        
        try{
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\integerFile.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File could not be found");
            System.exit(0);
        }
        
        System.out.println("Please enter a number (as an integer)");
        number = keyboard.nextInt();
        keyboard.nextLine();
        
        while(fileIn.hasNextLine())
        {
            int numOne = fileIn.nextInt();
            int numTwo = fileIn.nextInt();
            int numThree = fileIn.nextInt();
            int numFour = fileIn.nextInt();
            int numFive = fileIn.nextInt();
            int numSix = fileIn.nextInt();
            int numSeven = fileIn.nextInt();
            int numEight = fileIn.nextInt();
            int numNine = fileIn.nextInt();
            int numTen = fileIn.nextInt();
            
            if(numOne + numTwo == number)
            {
                System.out.println(numOne + " and " + numTwo + " is equal to the number typed in: " + number);
            }
            else if(numOne + numThree == number)
            {
                System.out.println(numOne + " and " + numThree + " is equal to the number typed in: " + number);
            }
            else if(numOne + numFour == number)
            {
                System.out.println(numOne + " and " + numFour + " is equal to the number typed in: " + number);
            }
            else if(numOne + numFive == number)
            {
                System.out.println(numOne + " and " + numFive + " is equal to the number typed in: " + number);
            }
            else if(numOne + numSix == number)
            {
                System.out.println(numOne + " and " + numSix + " is equal to the number typed in: " + number);
            }
            else if(numOne + numSeven == number)
            {
                System.out.println(numOne + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numOne + numEight == number)
            {
                System.out.println(numOne + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numOne + numNine == number)
            {
                System.out.println(numOne + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numOne + numTen == number)
            {
                System.out.println(numOne + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numThree == number)
            {
                System.out.println(numTwo + " and " + numThree + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numFour == number)
            {
                System.out.println(numTwo + " and " + numFour + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numFive == number)
            {
                System.out.println(numTwo + " and " + numFive + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numSix == number)
            {
                System.out.println(numTwo + " and " + numSix + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numSeven == number)
            {
                System.out.println(numTwo + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numEight == number)
            {
                System.out.println(numTwo + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numNine == number)
            {
                System.out.println(numTwo + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numTwo + numTen == number)
            {
                System.out.println(numTwo + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numThree + numFour == number)
            {
                System.out.println(numThree + " and " + numFour + " is equal to the number typed in: " + number);
            }
            else if(numThree + numFive == number)
            {
                System.out.println(numThree + " and " + numFive + " is equal to the number typed in: " + number);
            }
            else if(numThree + numSix == number)
            {
                System.out.println(numThree + " and " + numSix + " is equal to the number typed in: " + number);
            }
            else if(numThree + numSeven == number)
            {
                System.out.println(numThree + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numThree + numEight == number)
            {
                System.out.println(numThree + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numThree + numNine == number)
            {
                System.out.println(numThree + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numThree + numTen == number)
            {
                System.out.println(numThree + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numFour + numFive == number)
            {
                System.out.println(numFour + " and " + numFive + " is equal to the number typed in: " + number);
            }
            else if(numFour + numSix == number)
            {
                System.out.println(numFour + " and " + numSix + " is equal to the number typed in: " + number);
            }
            else if(numFour + numSeven == number)
            {
                System.out.println(numFour + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numFour + numEight == number)
            {
                System.out.println(numFour + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numFour + numNine == number)
            {
                System.out.println(numFour + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numFour + numTen == number)
            {
                System.out.println(numFour + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numFive + numSix == number)
            {
                System.out.println(numFive + " and " + numSix + " is equal to the number typed in: " + number);
            }
            else if(numFive + numSeven == number)
            {
                System.out.println(numFive + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numFive + numEight == number)
            {
                System.out.println(numFive + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numFive + numNine == number)
            {
                System.out.println(numFive + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numFive + numTen == number)
            {
                System.out.println(numFive + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numSix + numSeven == number)
            {
                System.out.println(numSix + " and " + numSeven + " is equal to the number typed in: " + number);
            }
            else if(numSix + numEight == number)
            {
                System.out.println(numSix + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numSix + numNine == number)
            {
                System.out.println(numSix + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numSix + numTen == number)
            {
                System.out.println(numSix + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numSeven + numEight == number)
            {
                System.out.println(numSeven + " and " + numEight + " is equal to the number typed in: " + number);
            }
            else if(numSeven + numNine == number)
            {
                System.out.println(numSeven + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numSeven + numTen == number)
            {
                System.out.println(numSeven + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numEight + numNine == number)
            {
                System.out.println(numEight + " and " + numNine + " is equal to the number typed in: " + number);
            }
            else if(numEight + numTen == number)
            {
                System.out.println(numEight + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numNine + numTen == number)
            {
                System.out.println(numNine + " and " + numTen + " is equal to the number typed in: " + number);
            }
            else if(numTen == number)
            {
                System.out.println(numTen + " is equal to the number you typed in: " + number);
            }
            else
            {
                System.out.println("No paired integers matched your number.");
            }
            
            
        }
    }
    
}
