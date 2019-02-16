/*
 * The purpose of this program is to read in a line of text
 * from a file instead of a variable or user input and change
 * the word of my choosing to a different word using the Scanner
 * object, fileInputStream and other methods.
 */
package stringwordchange2;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StringWordChange2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileIn = null;
        
        try
        {
            fileIn = new Scanner( new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\secondLine.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        
        String textLine;
        
        System.out.println("Text left to read? " + fileIn.hasNextLine());
        textLine = fileIn.nextLine();
        System.out.println("The line of text originally says " + "\n" + "\"" + textLine + "\"");
        System.out.println("\n");
        System.out.println("I will now change the first occurence of the word \"love\" to some other word.");
        
        int newLove = textLine.indexOf("love");
        String endOfTextLine = textLine.substring(newLove + "love".length());
        textLine = textLine.substring(0,newLove) + "\"appreciate\"" + endOfTextLine;

        System.out.println(textLine);
        System.out.println("Text left to read? " + fileIn.hasNextLine());
    }
    
}
