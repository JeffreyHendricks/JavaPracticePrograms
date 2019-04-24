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
public class PetDosage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pet joe = new Pet();
        Pet jeff = new Pet();
        Pet jenna = new Pet("Jenna", 26, 130, "Cat");
        
        System.out.println(jeff.equals(joe));
        System.out.println(jenna.toString());
        jeff.setType("Cat");
        System.out.println(jeff.equals(joe));
        jeff.setWeight(200);
        
        System.out.println(jenna.acepromazine());
        System.out.println(jenna.carProfen());
        System.out.println(jeff.acepromazine());
    }
    
}
