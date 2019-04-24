/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petdosage;

/**
 *
 * @author jeff
 */
public class Pet {
    private String name;
    private int age;
    private double weight;
    private String type;
    
    public Pet()
    {
        name = "No name yet";
        age = 0;
        weight = 0;
        type = "Not specified";
    }
    
    public Pet(String n)
    {
        name = n;
        age = 0;
        weight = 0;
        type = "Not specified";
    }
    
    public Pet(int a)
    {
        name = "No name yet";
        weight = 0;
        type = "Not specified";
        
        if(age < 0)
        {
            System.out.println("Age is less than zero");
            System.exit(0);
        }
        else
        {
            age = a;
        }
    }
    
    public Pet(double w)
    {
        name = "No name yet";
        age = 0;
        type = "Not specified";
        
        if(w < 0)
        {
            System.out.println("Weight cannot be less than zero");
            System.exit(0);
        }
        else
        {
            weight = w;
        }
    }
    
    public Pet(String n, int a, double w, String t)
    {
        name = n;
        
        if((a < 0) || (w < 0))
        {
            System.out.println("Age or weight cannot be less than zero");
            System.exit(0);
        }
        else
        {
            age = a;
            weight = w;
        }
        if(t.equalsIgnoreCase("Dog"))
        {
            type = "Dog";
        }
        else if(t.equalsIgnoreCase("Cat"))
        {
            type = "Cat";
        }
    }
    
    public void set(String newName, int newAge, double newWeight, String t)
    {
        name = newName;
        
        if((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Age or weight cannot be less than zero");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
        
        if(t.equalsIgnoreCase("Dog"))
        {
            type = "Dog";
        }
        else if(t.equalsIgnoreCase("Cat"))
        {
            type = "Cat";
        }
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int a)
    {
        if(a < 0)
        {
            System.out.println("Age cannot be less than zero");
            System.exit(0);
        }
        else
        {
            age = a;
        }
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setWeight(double w)
    {
        if(w < 0)
        {
            System.out.println("Weight cannot be less than zero");
            System.exit(0);
        }
        else
        {
            weight = w;
        }
    }
    
    public void setType(String t)
    {
        if(t.equalsIgnoreCase("Dog"))
        {
            type = "Dog";
        }
        else if(t.equalsIgnoreCase("Cat"))
        {
            type = "Cat";
        }
    }
    
    public String getType()
    {
        return type;
    }
    
    public String toString()
    {
        return("Type: " + type + "\nName: " + name + "\nAge: " + age + " Years" + "\nWeight: " +
                weight + " Pounds");
    }
    
    public boolean equals(Pet otherPet)
    {
        return(name.equalsIgnoreCase(otherPet.name) && age == (otherPet.age) &&
                weight == (otherPet.weight) && type.equalsIgnoreCase(otherPet.type));
    }
    
    public double acepromazine()
    {
        double dosage = 0;
        if(type.equalsIgnoreCase("Dog"))
        {
            dosage = ((weight/2.2)*(0.03/10));
        }
        else if(type.equalsIgnoreCase("Cat"))
        {
            dosage = ((weight/2.2)*(0.002/10));
        }
        return dosage;
    }
    
    public double carProfen()
    {
        double dosage = 0;
        if(type.equalsIgnoreCase("Dog"))
        {
            dosage = ((weight/2.2)*(.5/12));
        }
        else if(type.equalsIgnoreCase("Cat"))
        {
            dosage = ((weight/2.2)*(.25/12));
        }
        return dosage;
    }
}
