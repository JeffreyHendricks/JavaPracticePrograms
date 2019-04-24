/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

/**
 *
 * @author jeff
 */
public class PizzaOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza testP = new Pizza("Large",1,1,2);
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
        Pizza p4 = new Pizza("Medium",1,1,3);
        
        System.out.println(testP.getDescription());
        
        System.out.println(p2.equals(p3));
        
        System.out.println(p4.toString());
        
        p2.setCheese(1);
        p2.setHam(2);
        p2.setPepperoni(1);
        p2.setSize("Large");
        
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(testP));
        
        System.out.println(p4.getCheese());
        System.out.println(p4.getHam());
        System.out.println(testP.getSize());
        System.out.println(p3.getPepperoni());
        
    }
    
}
