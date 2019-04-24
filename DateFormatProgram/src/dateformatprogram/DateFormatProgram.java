/*
 * This program is a redefined version of a program already
 * coded for me in a book and just asks for a redefinition 
 * of how the month instance variable is defined and that
 * includes the redefinition of methods as well.
 */
package dateformatprogram;

/**
 *
 * @author jeff
 */
public class DateFormatProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date1 = new Date("December", 16, 1770);
        Date date2 = new Date(1,27,1756);
        Date date3 = new Date(1882);
        Date date4 = new Date();
        Date date5 = new Date(1,27,1756);
        
        System.out.println(date1.toString());
        System.out.println(date5.equals(date2));
        System.out.println(date2.getDay());
        date3.setYear(1988);
        date3.setMonth(7);
        date3.setDay(12);
        System.out.println(date3.toString());
    }
    
}
