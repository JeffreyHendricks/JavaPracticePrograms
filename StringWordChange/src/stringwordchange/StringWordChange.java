/*
 * The purpose of this project is to practice using the indexOf and substring methods
 * to replace a word in a string with another word. This should help build proficiency in 
 * knowing the uses of both methods and how to correctly and efficiently work with them.
 */
package stringwordchange;

/**
 *
 * @author jeff
 */
public class StringWordChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lovePhrase = "I love my wife!";
        
        System.out.println("The first phrase reads: " + lovePhrase);
        System.out.println("After the use of the indexOf and substring methods \nthe word love will be replaced with adore");
        
        int position = lovePhrase.indexOf("love");
        String endOfPhrase = lovePhrase.substring(position + "love".length());
        lovePhrase = lovePhrase.substring(0, position) + "adore" + endOfPhrase;
        
        System.out.println(lovePhrase);
        
        
    }
    
}
