/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateformatprogram;

/**
 *
 * @author jeff
 */
import java.util.Scanner;
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date()
    {
        month = 1;
        day = 1;
        year = 1000;
    }
    
    Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }
    
    public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }
    
    public Date(int year)
    {
        setDate(1,1,year);
    }
    
    public Date(Date aDate)
    {
        if(aDate == null)
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        
        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }
    
    public void setDate(int monthInt, int day, int year)
    {
        if(dateOK(monthInt, day, year))
        {
            this.month = monthInt;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }
    
    public void setDate(String monthString, int day, int year)
        {
            if(dateOK(monthString, day, year))
            {
                
                this.month = getMonth();
                this.day = day;
                this.year = year;
            }
            else
            {
                System.out.println("Fatal Error");
                System.exit(0);
            }
        }
    
    public void setDate(int year)
    {
        setDate(1,1,year);
    }
    
    public void setYear(int year)
    {
        if((year < 1000) || (year > 9999))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
        {
            this.year = year;
        }
    }
    
    public void setMonth(int monthNumber)
    {
        if((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
        {
            month = monthNumber;
        }
    }
    
    public void setDay(int day)
    {
        if((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
        {
            this.day = day;
        }
    }
    
    public int getMonth()
        {
            if(monthOK("January"))
                return 1;
            else if(monthOK("February"))
                return 2;
            else if(monthOK("March"))
                return 3;
            else if(monthOK("April"))
                return 4;
            else if(monthOK("May"))
                return 5;
            else if(monthOK("June"))
                return 6;
            else if(monthOK("July"))
                return 7;
            else if(monthOK("August"))
                return 8;
            else if(monthOK("September"))
                return 9;
            else if(monthOK("October"))
                return 10;
            else if(monthOK("November"))
                return 11;
            else if(monthOK("December"))
                return 12;
            else
            {
                System.out.println("Fatal Error");
                System.exit(0);
                return 0;
            }
        }
    
    public int getDay()
    {
        return day;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        return(month + " " + day + ", " + year);
    }
    
    public boolean equals(Date otherDate)
    {
        return((month == (otherDate.month)) &&
                (day == otherDate.day) && 
                (year == otherDate.year));
    }
    
    public boolean precedes(Date otherDate)
    {
        return( (year < otherDate.year) || year == otherDate.year && 
                getMonth() < otherDate.getMonth() ||
                year == otherDate.year && month == (otherDate.month) &&
                day < otherDate.day);
    }
    
    public void readInput()
    {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while(tryAgain)
        {
            System.out.println("Enter month, day, and year");
            System.out.println("Do not use a comma");
            
            String monthInput = keyboard.next();
            
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            
            if(dateOK(monthInput,dayInput,yearInput))
            {
                setDate(monthInput,dayInput,yearInput);
                tryAgain = false;
            }
            else
            {
                System.out.println("Illegal date.Reenter input.");
            }
        }
    }
    
    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return((monthInt >= 1) && (monthInt <= 12) &&
                (dayInt >= 1) && (dayInt <= 31) &&
                (yearInt >= 1000) && (yearInt <= 9999));
    }
    
    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return(monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) &&
                (yearInt >= 1000) && (yearInt <= 9999));
    }
    
    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("Febrauary") || month.equals("March")
                ||  month.equals("April") ||  month.equals("May") ||  month.equals("June")
                ||  month.equals("July") ||  month.equals("August") ||  month.equals("September")
                ||  month.equals("October") ||  month.equals("November") ||  month.equals("December"));
    }
    
    private String monthString(int monthNumber)
    {
        switch(monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal error");
                System.exit(0);
                return"Error";
        }
    }
}
