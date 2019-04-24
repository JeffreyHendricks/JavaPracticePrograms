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
public class AnimalSpecies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal tyson = new Animal("Dog",1, 90);
        Animal tyson2 = new Animal("Dog",1, 90);
        Animal tyson3 = new Animal("Dog",1,-10);
        Animal newAnimal = new Animal();
        
        System.out.println(tyson.toString());
        System.out.println(tyson.equals(tyson2));
        System.out.println(tyson3.isEndangered());
        System.out.println(tyson2.isEndangered());
        
        newAnimal.setName("Joe");
        newAnimal.setPopulation(3);
        newAnimal.setGrowthRate(98);
        System.out.println(newAnimal.getName());
        System.out.println(newAnimal.getPopulation());
        System.out.println(newAnimal.getGrowthRate());
    }
    
}
