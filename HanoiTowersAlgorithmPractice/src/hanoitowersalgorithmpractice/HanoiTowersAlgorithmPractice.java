/*
 * The purpose of this program was to demonstrate the use
 * of recursion as opposed to loops.
 */
package hanoitowersalgorithmpractice;

/**
 *
 * @author jeff
 */
public class HanoiTowersAlgorithmPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hanoi(3,"A","B","Aux");
       
    }
    
    public static void Hanoi(int n, String Beg, String End, String Aux)
    {
        if(n == 1)
        {
            System.out.println("Move 1 ring from tower " + Beg + " to tower " + End);
        }
        else
        {
            Hanoi(n-1,Beg,Aux,End);
            System.out.println("Move 1 ring from tower " + Beg + " to tower " + End);
            
            Hanoi(n-1,Aux,End,Beg); 
        }
    }
}
