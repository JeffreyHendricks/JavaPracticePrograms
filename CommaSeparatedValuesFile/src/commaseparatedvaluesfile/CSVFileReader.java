/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commaseparatedvaluesfile;

/**
 *
 * @author jeff
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class CSVFileReader {
    private String textFile;
    
    public CSVFileReader()
    {
        textFile = "";  
    }
    
    public CSVFileReader(String tF)
    {
        textFile = tF;
    }
    
    public void setTextFile(String t)
    {
        textFile = t;
    }
    
    public String getText()
    {
        return textFile;
    }
    
    public void readFile()
    {
         String list = "";
         Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream(textFile));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            System.exit(0);
        }
        
        while(fileIn.hasNextLine())
        {
            list += "\n" + fileIn.nextLine();
            fileIn.hasNextLine();
        }
        fileIn.close();
        
        StringTokenizer wordFactory = new StringTokenizer(list," \n");
        while(wordFactory.hasMoreTokens())
        {
            System.out.println(wordFactory.nextToken());
            wordFactory.hasMoreTokens();
        }
    }
}
