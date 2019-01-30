/*
 * The purpose of this program is to calculate the amount of 
 * hours, minutes and seconds in a given and set amount of seconds 
 * and print them to the screen for the user to see.
 */
package outputtimecalculation;

/**
 *
 * @author jeff
 */
public class OutputTimeCalculation {

    /**
     * @param args the command line arguments
     */
    public static final double SET_SECONDS = 50391;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double oneMinuteInSeconds = (6 * Math.pow(10,1));
        double oneSecond = (1 * Math.pow(10,0));
        double oneHourInSeconds = (60 * oneMinuteInSeconds);
        
        double hours = SET_SECONDS/oneHourInSeconds;
        double minutes = (SET_SECONDS%oneHourInSeconds)/oneMinuteInSeconds;
        double seconds = ((SET_SECONDS%oneHourInSeconds)%oneMinuteInSeconds)/oneSecond;
        
        hours = Math.floor(hours);
        minutes = Math.floor(minutes);
        seconds = Math.floor(seconds);
        
        
        
        
        
        System.out.println("Converting the number 50,391 from seconds to hours, minutes and seconds would turn into: ");
        System.out.println(hours + " Hours " + minutes + " Minutes and " + seconds + " Seconds");
    }
    
}
