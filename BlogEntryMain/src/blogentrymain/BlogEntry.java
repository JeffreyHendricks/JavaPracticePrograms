/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogentrymain;

/**
 *
 * @author jeff
 */
import java.util.StringTokenizer;
public class BlogEntry {
    private String userName;
    private String textEntry;
    private String date;
   
    
    public BlogEntry()
    {
        userName = "";
        textEntry = "";
        date = "";
    }
    
    public BlogEntry(String u, String text, String m, int d, int y)
    {
        userName = u;
        textEntry = text;
        
        date = m + " " + d + ", " + y;
        
    }
    
    public String DisplayEntry()
    {
        return userName + "\n " + textEntry + "\n " + date;
    }
    
    public void getSummary()
    {
        StringTokenizer nameFactory = new StringTokenizer(textEntry, " ,.\n");
        while(nameFactory.hasMoreTokens())
        {
            int nF = nameFactory.countTokens();
            
            if(nF > 10)
            {
                int count = 10;
                
                while(count > 0)
                {
                    System.out.println(nameFactory.nextToken());
                    count--;
                }
                return;
            }
        }
    }
}
