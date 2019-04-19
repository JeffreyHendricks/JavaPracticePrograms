/*
 * The purpose of this program is to demonstrate a basic 
 * understanding of classes and their constructors, accessor,
 * mutator and other methods.
 */
package beerbottlesong;

/**
 *
 * @author jeff
 */
public class BeerBottleSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BeerSong newSong = new BeerSong(99);
        
        
        newSong.printSong();
        
        
    }
    
}
