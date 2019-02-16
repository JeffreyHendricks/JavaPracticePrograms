/*
 * The purpose of this program is to read in a line of
 * text from a file and then output that line of text
 * for the user to see. First in lowercase and then in
 * uppercase.
 */
package readinwriteout;

/**
 *
 * @author jeff
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadInWriteOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileIn = null;
        
        try
        {
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\oneLine.txt"));
        }catch(FileNotFoundException e)
        {
            System.out.println("The file could not be found");
            System.exit(0);
        }
        
        String textLine;
        
        System.out.println("Text left to read? " + fileIn.hasNextLine());
        textLine = fileIn.nextLine();
        
        System.out.println(textLine.toUpperCase());
        System.out.println("\n");
        System.out.println(textLine.toLowerCase());
        System.out.println("File has line left to read? " + fileIn.hasNextLine());
        fileIn.close();
    }
    
}
