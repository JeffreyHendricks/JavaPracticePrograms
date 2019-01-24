/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metcaloriecalculation;

/**
 *
 * @author jeff
 */
public class METCalorieCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double poundWeight = 150.0;
        double kiloWeight = poundWeight/2.205;
        
        double caloriesPerMinute = 0.0175 * ((30 * 10) + (30 * 8) + (6 *1)) * kiloWeight;
        
        System.out.println(caloriesPerMinute);
    }
    
}
