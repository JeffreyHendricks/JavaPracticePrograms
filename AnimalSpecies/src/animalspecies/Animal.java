/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalspecies;

/**
 *
 * @author jeff
 */
public class Animal {
    private String name;
    private double growthRate;
    private double population;
    
    public Animal()
    {
        name = "No name yet";
        population = 0;
        growthRate = 0;
    }
    
    public Animal(String n)
    {
        name = n;
        population = 0;
        growthRate = 0;
    }
    
    public Animal(String n, double p)
    {
        name = n;
        population = p;
        growthRate = 0;
    }
    
    public Animal(String n, double p, double g)
    {
        name = n;
        population = p;
        growthRate = g;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setPopulation(double p)
    {
        population = p;
    }
    
    public double getPopulation()
    {
        return population;
    }
    
    public void setGrowthRate(double g)
    {
        growthRate = g;
    }
    
    public double getGrowthRate()
    {
        return growthRate;
    }
    
    public String toString()
    {
        return("The name of the species is: " + name + "\nThe population is: " + population +
                "\nThe growth rate is: " + growthRate + "%");
    }
    
    public boolean equals(Animal otherAnimal)
    {
        return(name.equalsIgnoreCase(otherAnimal.name) && population == (otherAnimal.population) &&
                growthRate == (otherAnimal.growthRate));
    }
    
    public boolean isEndangered()
    {
        if(growthRate < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
