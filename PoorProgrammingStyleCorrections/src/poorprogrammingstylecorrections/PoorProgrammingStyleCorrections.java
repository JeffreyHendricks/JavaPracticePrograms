/*
 * The purpose of this application is to practice my understanding of
 * Naming Conventions for variables and Constand Variables as well as
 * work on recognizing and correcting bad formatting style and spelling conventions
 */
package poorprogrammingstylecorrections;

/**
 *
 * @author jeff
 */
public class PoorProgrammingStyleCorrections {

    /**
     * @param args the command line arguments
     */
    public static final double DISTANCE = 6.21;
    public static void main(String[] args) {
        
        /* I am placing the original code here so that I may see the corrections I made:
        
            public class poorProgrammingStyle{
                
                public static void main(String[] args)
                {
                    double TIME; double PACE;
                    System.out.println("This program calculates your pace given a time and distance traveled.");
                    TIME = 35.5; //35 minutes and 30 seconds  
                    PACE = TIME/distance;
                    System.out.println("Your pace is " + PACE + "miles per hour");
                }
                 public static final double distance = 6.21;
            }
        */
        
        double timeInMinutes, paceInMph;
        
        timeInMinutes = 35.5;    //35 minutes and 30 seconds
        paceInMph = timeInMinutes / DISTANCE;
        
        System.out.println("This program calculates your pace given a time and the distance traveled");
        System.out.println("With a time of: " + timeInMinutes + "\nand a distance of: " + DISTANCE + " traveled");
        System.out.println("Your pace would be around: " + paceInMph + "MPH");
        System.out.println("The pace rounding up would be: " + Math.round(paceInMph) + "MPH");
        
    }
    
}
