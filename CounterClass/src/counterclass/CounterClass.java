/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterclass;

/**
 *
 * @author jeff
 */
public class CounterClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter newCounter = new Counter();
        Counter newCounter2 = new Counter();
        
        newCounter.countIncrease();
        newCounter.countIncrease();
        System.out.println(newCounter.printCount());
        newCounter.countDecrease();
        System.out.println(newCounter.printCount());
        newCounter.countIncrease();
        newCounter.countIncrease();
        newCounter.countIncrease();
        newCounter.countIncrease();
        System.out.println(newCounter.printCount());
        newCounter.setToZero();
        System.out.println(newCounter.toString());
        
        System.out.println("\n");
        newCounter2.countIncrease();
        newCounter2.countIncrease();
        newCounter2.countIncrease();
        newCounter2.countIncrease();
        
        System.out.println(newCounter2.getCount());
        
        System.out.println(newCounter.equals(newCounter2));
        
        newCounter2.setToZero();
        System.out.println(newCounter.equals(newCounter2));
        
    }
    
}
