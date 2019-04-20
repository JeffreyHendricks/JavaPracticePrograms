/*
 * The purpose of this program is to simulate a blog entry 
 * for a website (username, entry and date of entry) and to 
 * also demonstrate a basic understanding of the uses of 
 * the StringTokenizer
 */
package blogentrymain;

/**
 *
 * @author jeff
 */
public class BlogEntryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BlogEntry bE1 = new BlogEntry("Jeff","Hello there and this is my newest creation in the java world.","July", 12, 1988);
        
        bE1.getSummary();
        System.out.println(bE1.DisplayEntry());
    }
    
}
