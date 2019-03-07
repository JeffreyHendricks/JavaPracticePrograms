/*
 * This program will read a text file of many words
 * and search through for the longest word that is 
 * a palindrome and then print it out to the screen.
 */
package palindromecheck;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PalindromeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileIn = null;
        String word1, word2 = "", word3 = "";
        
        try{
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\Documents\\javaText\\words.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File could not be found.");
            System.exit(0);
        }
        
        while(fileIn.hasNextLine())
        {
            word1 = fileIn.nextLine();
            word2 = "";
            for(int i = word1.length()-1; i >= 0; i--)
            {
                
                word2 = word2 + word1.charAt(i);
            }
              
             if(word1.equalsIgnoreCase(word2))
            {
                if(word1.length() > word3.length())
                {
                    word3 = word1;
                    System.out.println(word3);
                }
            }
             
            }
                System.out.println(word3);
            
        } 
}
