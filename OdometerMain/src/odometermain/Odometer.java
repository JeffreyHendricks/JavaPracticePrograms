/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odometermain;

/**
 *
 * @author jeff
 */
public class Odometer {
    private double milesDriven;
    private double mpg;
    
    public Odometer()
    {
        milesDriven = 0;
        mpg = 0;
    }
    
    public Odometer(double m, double mileP)
    {
        milesDriven = m;
        mpg = mileP;
    }
    
    public void resetOdometer()
    {
        milesDriven = 0;
    }
    
    public void addMiles(double newMiles)
    {
        milesDriven += newMiles;
    }
    
    public void setMPG(double newMPG)
    {
        mpg = newMPG;
    }   
    
    public String fuelEfficiency()
    {
        double gallonsUsed = (mpg*milesDriven);
        return("The gallons of gas used for this trip was: " + gallonsUsed);
    }
    
    public String toString()
    {
        return("The miles driven are: " + milesDriven + " miles." + 
                "\nThe fuel effiency of the vehicle is: " + mpg + " miles per gallon.");
    }
    
}
