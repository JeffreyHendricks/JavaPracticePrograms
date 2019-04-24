/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureprogram;

/**
 *
 * @author jeff
 */
import java.text.DecimalFormat;

public class Temperature {
    private double temp;
    private String degreeScale;
    DecimalFormat dFormat = new DecimalFormat("#0.00");
    
    public Temperature()
    {
        temp = 0;
        degreeScale = "C";
    }
    
    public Temperature(double t)
    {
        temp = t;
        degreeScale = "C";
    }
    
    public Temperature(String c)
    {
        temp = 0;
        degreeScale = c;
    }
    
    public Temperature(double t, String c)
    {
        temp = t;
        degreeScale = c;
    }
    
    public void setTemp(double t)
    {
        temp = t;
    }
    
    public void setDegree(String d)
    {
        degreeScale = d;
    }
    
    public void setAll(double t, String d)
    {
        temp = t;
        degreeScale = d;
    }
    
    public boolean equals(Temperature otherTemp)
    {
        if(degreeScale.equalsIgnoreCase("C"))
        {
            otherTemp.getDegreesC();
        }
        else if(degreeScale.equalsIgnoreCase("F"))
        {
            otherTemp.getDegreesF();
        }
        return(temp == (otherTemp.temp));
    }
    
    public boolean isGreater(Temperature otherTemp)
    {
        if(degreeScale.equalsIgnoreCase("C"))
        {
            otherTemp.getDegreesC();
        }
        else if(degreeScale.equalsIgnoreCase("F"))
        {
            otherTemp.getDegreesF();
        }
        return(temp > (otherTemp.temp));
    }
    
    public boolean isLess(Temperature otherTemp)
    {
        if(degreeScale.equalsIgnoreCase("C"))
        {
            otherTemp.getDegreesC();
        }
        else if(degreeScale.equalsIgnoreCase("F"))
        {
            otherTemp.getDegreesF();
        }
        return(temp < (otherTemp.temp));
    }
    
    public String toString()
    {
        return("The temperature is: " + temp + " " + degreeScale);
    }
    
   public String getDegreesC()
   {
       if(degreeScale.equalsIgnoreCase("F"))
       {
           temp = Math.round((5*(temp - 32)/9)); 
           degreeScale = "C";
       }
       else
       {
           return "Error";
       }
       return dFormat.format(temp) + " " + degreeScale;
   }
   
   public String getDegreesF()
   {
       if(degreeScale.equalsIgnoreCase("C"))
       {
           temp = Math.round((9*(temp)/5)+32);
           degreeScale = "F";
       }
       else
       {
           System.out.println("The degrees need to be Celsius first.");
           return "Error";
       }
       return dFormat.format(temp) + " " + degreeScale;
   }
}
