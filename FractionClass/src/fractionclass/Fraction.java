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
public class Fraction {
    private double numerator;
    private double denominator;
    private double gcd;
    
    public Fraction()
    {
        numerator = 0;
        denominator = 0;
        gcd = 0;
    }
    
    public Fraction(double n, double d)
    {
        numerator = n;
        denominator = d;
        gcd = greatestCommonD(n, d);
        
    }
    
    private double greatestCommonD(double n, double d)
    {
        double r = 0;
        
        while(n%d > 0)
        {
            r = n%d; 
            n = d;
            d = r;
        }
        return d;
    }
    
    public double getNumerator()
    {
        return numerator;
    }
    
    public void setNumerator(double n)
    {
        numerator = n;
    }
    
    public double getDenominator()
    {
        return denominator;
    }
    
    public void setDenominator(double d)
    {
        denominator = d;
    }
    
    public double getGCD()
    {
        return gcd;
    }
    
    public String toString()
    {
        return ("The numerator is: " +  numerator + "\nThe denominator is: " + denominator + 
                "\nThe greatest common divisor is: " + gcd);
    }
    
    public double lowestTerms()
    {
        double notLowest = (numerator/denominator);
        double greatest = greatestCommonD(numerator, denominator);
        double lNum = numerator/greatest;
        double lDen = denominator/greatest;
        return lNum/lDen;
    }
    
}
