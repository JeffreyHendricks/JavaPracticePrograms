/*
 * The purpose of this project is to calculate how many drinks you can stand
 * of 12 oz sodas or 16 oz coffees before they will become a lethal overdose
 * of caffeine for your body. The amount of milligrams of caffeine is given 
 * for each. The amount of caffeine considered lethal is 10 grams consumed at once
 * and the amount of milligrams in a gram is 1000.
 */
package overdoseofcaffeinecalculation;

/**
 *
 * @author jeff
 */
public class OverdoseOfCaffeineCalculation {

    /**
     * @param args the command line arguments
     */
    public static final double MAX_MILLIGRAMS = 10000;
    public static final double LETHAL_CAFFEINE_AMOUNT_GRAMS = 10;
    public static final double SODA_CAFFEINE_AMOUNT_MILLIGRAMS = 34;
    public static final double COFFEE_CAFFEINE_AMOUNT_MILLIGRAMS = 160;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("A lethal overdose of caffeine is considered by scientists to be 10 grams at once.");
        System.out.println("There are 1000 milligrams(mg) in one gram so we can withstand up to 10,000 mg at once.");
        System.out.println("From this information, we will find out how many drinks of soda or coffee we can drink at once, given their caffeine amount in mg.");
        System.out.println("A 12 oz. can of soda typically contains 34 mg of caffeine.");
        System.out.println("A 16 oz. cup of coffee typically contains 160 mg of caffeine.");
        
        double sodaAmountBeforeLethal = Math.floor(MAX_MILLIGRAMS/SODA_CAFFEINE_AMOUNT_MILLIGRAMS);
        double coffeeAmountBeforeLethal = Math.floor(MAX_MILLIGRAMS/COFFEE_CAFFEINE_AMOUNT_MILLIGRAMS);
        
        System.out.println("The amount of 12 oz. sodas you can drink at once before it becomes lethal to you is:");
        System.out.println(sodaAmountBeforeLethal + " cans");
        System.out.println("The amount of 16 oz. coffees you can drink at once before it becomes lethal to you is:");
        System.out.println(coffeeAmountBeforeLethal + " cups");
        
        
    }
    
}
