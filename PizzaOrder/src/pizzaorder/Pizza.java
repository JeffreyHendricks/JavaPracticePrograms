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
import java.text.DecimalFormat;
public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    
    public Pizza()
    {
        size = "Not specified";
        cheeseToppings = 0;
        pepperoniToppings = 0;
        hamToppings = 0;
    }
    
    public Pizza(String s)
    {
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large"))
        {
        size = s;
        }
        else{
            System.out.println("You can only enter small, medium or large.");
            System.exit(0);
        }
        cheeseToppings = 0;
        pepperoniToppings = 0;
        hamToppings = 0;
    }
    
    public Pizza(String s, int c)
    {
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large"))
        {
        size = s;
        }
        else{
            System.out.println("You can only enter small, medium or large.");
            System.exit(0);
        }
        
        if(c < 0)
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
        cheeseToppings = c;
        }
        
        pepperoniToppings = 0;
        hamToppings = 0;
    }
    
    public Pizza(String s, int c, int p)
    {
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large"))
        {
        size = s;
        }
        else{
            System.out.println("You can only enter small, medium or large.");
            System.exit(0);
        }
        
        if((c < 0) || (p < 0))
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
        cheeseToppings = c;
        pepperoniToppings = p;
        }
        
        hamToppings = 0;
    }
    
    public Pizza(String s, int c, int p, int h)
    {
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large"))
        {
        size = s;
        }
        else{
            System.out.println("You can only enter small, medium or large.");
            System.exit(0);
        }
        if((c < 0) || (p < 0) || (h < 0))
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
        cheeseToppings = c;
        pepperoniToppings = p;
        hamToppings = h;
        }
    }
    
    public void setSize(String s)
    {
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large"))
        {
            size = s;
        }
        else
        {
            System.out.println("The size can only be small, medium, or large");
            System.exit(0);
        }
    }
    
    public String getSize()
    {
        return size;
    }
    
    public void setCheese(int c)
    {
        if(c < 0)
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
            cheeseToppings = c;
        }
    }
    
    public int getCheese()
    {
        return cheeseToppings;
    }
    
    public void setPepperoni(int p)
    {
        if(p < 0)
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
            pepperoniToppings = p;
        }
    }
    
    public int getPepperoni()
    {
        return pepperoniToppings;
    }
    
    public void setHam(int h)
    {
        if(h < 0)
        {
            System.out.println("The toppings cannot be negative.");
            System.exit(0);
        }
        else
        {
            hamToppings = h;
        }
    }
    
    public int getHam()
    {
        return hamToppings;
    }
    
    public String toString()
    {
        return("The pizza size is: " + size + "\nThe number of cheese toppings is: " + cheeseToppings +
                "\nThe number of pepperoni toppings is: " + pepperoniToppings + 
                "\nThe number of ham toppings is: " + hamToppings);
    }
    
    public boolean equals(Pizza otherPizza)
    {
        return(size.equalsIgnoreCase(otherPizza.size) && cheeseToppings == (otherPizza.cheeseToppings)
                && (pepperoniToppings == (otherPizza.pepperoniToppings) && 
                hamToppings == (otherPizza.hamToppings)));
    }
    
    public double calcCost()
    {
        double cost = 0;
        if(size.equalsIgnoreCase("small"))
        {
            cost = (10 + (2*(cheeseToppings) + 2 * (pepperoniToppings) + 2 * (hamToppings)));
        }
        else if(size.equalsIgnoreCase("medium"))
        {
            cost = (12 + (2*(cheeseToppings) + 2 * (pepperoniToppings) + 2 * (hamToppings)));
        }
        else if(size.equalsIgnoreCase("large"))
        {
            cost = (14 + (2*(cheeseToppings) + 2 * (pepperoniToppings) + 2 * (hamToppings)));
        }
        return cost;
    }
    
    public String getDescription()
    {
        DecimalFormat dFormat = new DecimalFormat("#0.00");
        return("A: " + size + " pizza with: " + cheeseToppings +
                " cheese toppings: \n" + pepperoniToppings + 
                " pepperoni toppings and: \n" + hamToppings + " ham toppings will cost " + "$" 
                + dFormat.format(calcCost()));
    }
    
}
