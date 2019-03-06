/*
 * This program will solve a cryptarithmetic puzzle
 * by using loops to assign a number value to each letter
 * and then solving for the value of the message after the values 
 * are assigned to the letters
 */
package cryptarithmeticpuzzle;

/**
 *
 * @author jeff
 */
public class CryptarithmeticPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int T = 0, O = 0, G = 0, D = 0;
        
        for(T=0;T < 10;T++)
        {
            for(O = 0; O < 10; O++)
            {
                for(G = 0; G < 10; G++)
                {
                    for(D = 0; D < 10; D++)
                    {
                        if(T != G && T != O && T != D && G != O && G != D && O != D && 
                                (400 * T) + (40 * O) + (4 * O) == (1000 *G) + (100 * O) + (10 * O) + D)
                            {
                                System.out.println("T: " + T);
                                System.out.println("O: " + O);
                                System.out.println("O: " + O);
                                System.out.println("This is equal to: " + T + O + O);
                                System.out.println("G: " + G);
                                System.out.println("O: " + O);
                                System.out.println("O: " + O);
                                System.out.println("D: " + D);
                                System.out.println("This is equal to: " + G + O + O + D);
                            }
                        }
                    }
                }
            }
        }
    }
