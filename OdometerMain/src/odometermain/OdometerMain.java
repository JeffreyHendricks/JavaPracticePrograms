/*
 * The purpose of this program is to demonstrate a basic
 * level of understanding of classes and their methods and
 * constructors
 */
package odometermain;

/**
 *
 * @author jeff
 */
public class OdometerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Odometer newO = new Odometer(30, 25);
        Odometer newO2 = new Odometer(50, 50);
        
        System.out.println(newO.toString());
        newO.resetOdometer();
        newO.addMiles(20);
        System.out.println(newO.toString());
        
        System.out.println(newO2.fuelEfficiency());
        
    }
    
}
