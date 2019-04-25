/*
 * This program will demonstrate a basic undertsanding of classes as well as
 * reading input from a text file and create a random bundle of food for 
 * a delivery service.
 */
package communitysupportedaggriculture;

/**
 *
 * @author jeff
 */
public class CommunitySupportedAggriculture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoxOfProduce newBox = new BoxOfProduce();
        
        newBox.setFoodOne();
        newBox.setFoodTwo();
        newBox.setFoodThree();
        
        System.out.println(newBox.toString());
        System.out.println(newBox.foodSub());
    }
    
}
