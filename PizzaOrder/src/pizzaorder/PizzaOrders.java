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
public class PizzaOrders {
    private Pizza pizza1,pizza2,pizza3;
    private int numOfPizzas;
    
    public PizzaOrders()
    {
        if(numOfPizzas <= 0)
        {
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
        }
        else if(numOfPizzas == 1)
        {
            Pizza p1 = new Pizza();
            setPizza1(p1);
        }
    }
    
    public void setPizza1(Pizza p1)
    {
        if(p1 == null)
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else if((numOfPizzas < 1))
        {
            System.out.println("You cannot add another pizza.");
            System.exit(0);
        }
        else
        {
            pizza1 = p1;
        }
    }
    
    public void setPizza2(Pizza p2)
    {
        if(p2 == null)
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else if((numOfPizzas < 2))
        {
            System.out.println("You cannot add another pizza.");
            System.exit(0);
        }
        else
        {
            pizza2 = p2;
        }
    }
    
    public void setPizza3(Pizza p3)
    {
        if(p3 == null)
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else if((numOfPizzas < 3))
        {
            System.out.println("You cannot add another pizza.");
            System.exit(0);
        }
        else
        {
            pizza3 = p3;
        }
    }
    
    public void setNumPizzas(int numPizza)
    {
        if(numPizza < 0)
        {
            System.out.println("Number cannot be negative");
            System.exit(0);
        }
        else if((numPizza > 0) && (numPizza <= 3))
        {
            numOfPizzas = numPizza;
        }
    }
    
    public double calcTotal()
    {
        double totalCost = 0;
        if((pizza1 != null) && (pizza2 == null) && (pizza3 == null))
        {
            totalCost = pizza1.calcCost();
        }
        else if((pizza1 != null) && (pizza2 != null) && (pizza3 == null))
        {
            totalCost = pizza1.calcCost() + pizza2.calcCost();
        }
        else if((pizza1 != null) && (pizza2 != null) && (pizza3 != null))
        {
            totalCost = pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
        }
        return totalCost;
    }
    
}
