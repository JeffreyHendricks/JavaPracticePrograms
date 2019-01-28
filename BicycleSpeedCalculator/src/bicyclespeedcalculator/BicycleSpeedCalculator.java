/*
 * The purpose of this application is to determine the speed a bicyclist is going.
 * I will determine this using the gear size and cadence.
 */
package bicyclespeedcalculator;

/**
 *
 * @author jeff
 */
public class BicycleSpeedCalculator {

    /**
     * @param args the command line arguments
     */
    /* 
     * I am using all final constants because the numbers for this project are unchanging
     * and do not need to be entered other than in one original place.
    */
    public static final double MATH_PI = Math.PI;
    public static final double ONE_FOOT = 1.0/12.0;
    public static final double ONE_MILE = 1.0/5280.0;
    public static final double ONE_HOUR = 60.0/1.0;
    public static final double GEAR_SIZE = 100.0;
    public static final double CADENCE = 90;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        double speedCalculation = GEAR_SIZE * MATH_PI * ONE_FOOT * ONE_MILE * CADENCE * ONE_HOUR;
        
        System.out.println("A bicyclist can calculate their speed if they know their :");
        System.out.println("Gear size (inches) and cadence (rpm) are known");
        System.out.println("A gear size of 100 inches and a cadence of 90 rpm will have a max speed of: ");
        System.out.println(speedCalculation + " MPH");
        
    }
    
}
