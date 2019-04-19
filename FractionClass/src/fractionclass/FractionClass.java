/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionclass;

/**
 *
 * @author jeff
 */
public class FractionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction newFraction = new Fraction(20, 60);
        Fraction fraction2 = new Fraction(990, 210);
        
        System.out.println(newFraction.toString());
        System.out.println(newFraction.getGCD());
        System.out.println(newFraction.lowestTerms());
        
        System.out.println(fraction2.toString());
        System.out.println(fraction2.getGCD());
        System.out.println(fraction2.lowestTerms());
    }
    
}
