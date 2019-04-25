/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitysupportedaggriculture;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class BoxOfProduce {
    private String food1;
    private String food2;
    private String food3;
    
    public BoxOfProduce()
    {
        food1 = "";
        food2 = "";
        food3 = "";
    }
    
    public void setFoodOne()
    {
        food1 = randomSelection();
    }
    
    public String getFoodOne()
    {
        return food1;
    }
    
    public void setFoodTwo()
    {
        food2 = randomSelection();
    }
    
    public String getFoodTwo()
    {
        return food2;
    }
    
    public void setFoodThree()
    {
        food3 = randomSelection();
    }
    
    public String getFoodThree()
    {
        return food3;
    }
    
    private String randomSelection()
    {
        Scanner fileIn = null;
        String[] food = new String[5];
        int count = 0;
        int rando = (int)Math.floor(Math.random() * food.length);
        
        try
        {
            fileIn = new Scanner(new FileInputStream("C:\\Users\\jeff\\"
                    + "Documents\\javaText\\randomFruitsAndVeggies.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            System.exit(0);
        }
        while(fileIn.hasNextLine())
        {
           if(count <= food.length)
           {
            food[count] = fileIn.nextLine();
            count++;
           }
            fileIn.hasNextLine();
        }
            fileIn.close();
        
        return food[rando];
    }
    
    public String foodSub()
    {
        String newFood = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Would you like to substitute any of your food items"
                + " for another in your box?");
        System.out.println("Press \"Y\" for yes or \"N\" for no: ");
        String choice = keyboard.nextLine();
        if(choice.equalsIgnoreCase("y"))
        {
            System.out.println("Which item would you like to replace?");
            System.out.println("Please choose item 1,2 or 3:");
            int itemChoice = keyboard.nextInt();
            
            if(itemChoice == 1)
            {
                System.out.println("Which item should we substitute for item 1?"
                        );
                System.out.println("Please enter item 2 or 3.");
                int newChoice = keyboard.nextInt();
                
                if(newChoice == 2)
                {
                     newFood = food2;
                }
                else if(newChoice == 3)
                {
                     newFood = food3;
                }
                food1 = newFood;
            }
            else if(itemChoice == 2)
            {
                System.out.println("Which item should we substitute for item 2?"
                        );
                System.out.println("Please enter item 1 or 3.");
                int newChoice = keyboard.nextInt();
                
                if(newChoice == 1)
                {
                     newFood = food1;
                }
                else if(newChoice == 3)
                {
                     newFood = food3;
                }
                food2 = newFood;
            }
            else if(itemChoice == 3)
            {
                System.out.println("Which item should we substitute for item 3?"
                        );
                System.out.println("Please enter item 1 or 2.");
                int newChoice = keyboard.nextInt();
                
                if(newChoice == 1)
                {
                     newFood = food1;
                }
                else if(newChoice == 2)
                {
                     newFood = food2;
                }
                food3 = newFood;
            }
        }
        else if(choice.equalsIgnoreCase("n"))
        {
            System.out.println("Thank you, your items in the box are finished"
                    + " being delivered then.");
        }
        return toString();
    }
    
    public String toString()
    {
        return("The first item is: " + food1 + "\nThe second item is: " + 
                food2 + "\nThe third item is: " + food3);
    }
    
    public boolean equals(BoxOfProduce otherBox)
    {
        return(food1 == (otherBox.food1) && food2 == (otherBox.food2) &&
                food3 == (otherBox.food3));
    }
}
