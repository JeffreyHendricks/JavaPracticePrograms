/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadecouponscalculation;
import java.util.Scanner;
/**
 *
 * @author jeff
 */
public class ArcadeCouponsCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);      
        int gameCoupons = 0;
     
        System.out.println("Please enter the number of coupons you have won!");
        gameCoupons = keyboard.nextInt();
        int candyBar = gameCoupons/10;
        int gumball = (gameCoupons%10)/3;
        
        System.out.println("With " + gameCoupons + " coupons you can have: " + candyBar + " candy bars!");
        System.out.println("and with the left over coupons you can have: " + gumball + " gumballs!");
    }
    
}
