/*
 * This program is the same as the versions before it 
 * the only difference is that it will use a loop to
 * read in the data and check to see if there is more
 * to read. If not then it will exit.
 */
package idealbodyweightversion3;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IdealBodyWeightVersion3 {

    /**
     * @param args the command line arguments
     */
    public static final int ORIGINAL_WEIGHT = 110;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileIn = null;
        String person;
        int heightFeet;
        int heightInches;
        
        try{
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\fifthLine.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File could not be found.");
            System.exit(0);
        }
        
        if(fileIn.hasNextLine())
        {
            while(fileIn.hasNextLine())
            {
            person = fileIn.nextLine();
            heightFeet = fileIn.nextInt();
            heightInches = fileIn.nextInt();
            fileIn.nextLine();
           
            
            int totalHeightInInches = (heightFeet * 12) + heightInches ;
            int idealWeight = (ORIGINAL_WEIGHT + ((totalHeightInInches - 60) * 5));
        
            System.out.println(person + " has a height of " + heightFeet + "'" + heightInches);
            System.out.println("Their ideal body weight for their height would be " + idealWeight + " pounds");
            }
        }
        else
            fileIn.close();
        
    }
    
}
