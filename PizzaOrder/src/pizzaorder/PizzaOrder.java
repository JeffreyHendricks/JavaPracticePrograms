/*
 * The purpose of this program is to immitate a pizza order app
 * one class will be used to crerate the pizzas and the order 
 * and the other class will be made to hold the orders.
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
        Pizza p3 = new Pizza("Large",1,1,2);
        Pizza p4 = new Pizza("Medium",1,1,3);
        PizzaOrders order = new PizzaOrders();
        
        order.setNumPizzas(1);
        order.setPizza1(testP);
        System.out.println(order.calcTotal());
        order.setNumPizzas(3);
        order.setPizza2(p4);
        System.out.println(order.calcTotal());
        order.setPizza3(p3);
        System.out.println(order.calcTotal());
        
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
