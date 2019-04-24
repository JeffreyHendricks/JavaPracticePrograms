/*
 * This program is to demonstrate basic knowledge of classes and
 * their accessor and mutator methods as well as using conversion
 * for the degrees of Celsius and Fahrenheit.
 */
package temperatureprogram;

/**
 *
 * @author jeff
 */
public class TemperatureProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temperature temp = new Temperature(212,"F");
        Temperature temp2 = new Temperature(100,"C");
        Temperature temp3 = new Temperature();
        Temperature temp4 = new Temperature();
        
        System.out.println(temp.getDegreesC());
        System.out.println(temp.getDegreesF());
        System.out.println(temp2.getDegreesF());
        
       
        temp.setDegree("C");
        temp.setTemp(0);
        temp2.setAll(212,"F");
       
        System.out.println(temp.toString());
        System.out.println(temp2.toString());  

       
        System.out.println(temp3.isLess(temp4));
        System.out.println(temp3.isGreater(temp4));
        System.out.println(temp3.equals(temp4));
        System.out.println(temp.equals(temp2));
       
    }
    
}
