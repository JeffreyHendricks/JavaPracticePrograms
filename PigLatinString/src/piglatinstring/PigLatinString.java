/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatinstring;
import java.util.Scanner;
/**
 *
 * @author jeff
 */
public class PigLatinString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String first, last;
        
        System.out.println("Please enter your frst name:");
        first = keyboard.nextLine().toLowerCase();
        
        System.out.println("Please enter your last name:");
        last = keyboard.nextLine().toLowerCase();
        
        String firstLetter = first.substring(0,1) + "ay";
        first = first.substring(1,2).toUpperCase() + first.substring(2) + firstLetter;
        
        String lastLetter = last.substring(0,1) + "ay";
        last = last.substring(1,2).toUpperCase() + last.substring(2) + lastLetter;
        
        System.out.println("Your name in piglatin is: " + first + " " + last);
        
        
    }
    
}
