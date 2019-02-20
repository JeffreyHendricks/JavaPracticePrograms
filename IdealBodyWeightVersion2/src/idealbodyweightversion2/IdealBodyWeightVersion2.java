/*
 * The purpose of this program is to re-write the previously
 * used program to calculate someones ideal weight based on
 * their height. This time we will br reading in information
 * on the candidates from a separate file and calculating without
 * entering any information ourselves except for the calculation
 * formula and the Scanner and other needed imports.
 */
package idealbodyweightversion2;

/**
 *
 * @author jeff
 */

    import java.util.Scanner;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;

public class IdealBodyWeightVersion2 {

    /**
     * @param args the command line arguments
     */
    public static final int ORIGINAL_WEIGHT = 110;      //Traditional weight for first 5 feet of height
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner fileIn = null;
        
        String personOne, personTwo, personThree;
        int heightFeet = 0, heightInches = 0, heightTwoFeet, heightTwoInches, heightThreeFeet, heightThreeInches, weightOne, weightTwo, weightThree;
        
        try
        {
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\thirdLine.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        
        System.out.println("File has next line to read? " + fileIn.hasNextLine());
        personOne = fileIn.nextLine();
        heightFeet = fileIn.nextInt();
        heightInches = fileIn.nextInt();
        fileIn.nextLine();
        
        int totalHeightInInches = (heightFeet * 12) + heightInches ;
        int idealWeight = (ORIGINAL_WEIGHT + ((totalHeightInInches - 60) * 5));
        
        System.out.println(personOne + " has a height of " + heightFeet + "'" + heightInches);
        System.out.println("Their ideal body weight for their height would be " + idealWeight + " pounds");
        
        
        personTwo = fileIn.nextLine();
        heightTwoFeet = fileIn.nextInt();
        heightTwoInches = fileIn.nextInt();
        fileIn.nextLine();
        
        
        totalHeightInInches = (heightTwoFeet * 12) + heightTwoInches;
        idealWeight = (ORIGINAL_WEIGHT + ((totalHeightInInches - 60) * 5));
        
        System.out.println(personTwo + " has a height of " + heightTwoFeet + "'" + heightTwoInches);
        System.out.println("Their ideal body weight for their height would be " + idealWeight + " pounds");
        
        personThree = fileIn.nextLine();
        heightThreeFeet = fileIn.nextInt();
        heightThreeInches = fileIn.nextInt();
                
        totalHeightInInches = (heightThreeFeet * 12) + heightThreeInches;
        idealWeight = (ORIGINAL_WEIGHT + ((totalHeightInInches - 60) * 5));
        
        System.out.println(personThree + " has a height of " + heightThreeFeet + "'" + heightThreeInches);
        System.out.println("Their ideal body weight for their height would be " + idealWeight + " pounds");
        
        fileIn.close();
        
        
        
           
    }
    
}
