/*
 * This program will estimate a persons ideal body weight for thier
 * height in feet and inches. It will allow 110 lbs for the the first 5 feet.
 * After that, any additional inch will call for an additional 5 lbs to be added
 * to the weight to be at the ideal weight for your height.
 */
package estimatingidealbodyweight;

/**
 *
 * @author jeff
 */
public class EstimatingIdealBodyWeight {

    /**
     * @param args the command line arguments
     */
    
    public static final int ORIGINAL_POUNDS = 110;
    public static final int HEIGHT_IN_FEET = 5;
    public static final int HEIGHT_IN_INCHES = 2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalHeightInInches = ((HEIGHT_IN_FEET * 12) + HEIGHT_IN_INCHES);
        int idealWeight = (ORIGINAL_POUNDS + ((totalHeightInInches - 60) * 5));
                
        System.out.println("For a person with a height of: ");
        System.out.println(HEIGHT_IN_FEET + " feet and " + HEIGHT_IN_INCHES +" inches");
        System.out.println("Their ideal body weight would be:");
        System.out.println(idealWeight + " lbs");
        
    }
    
}
