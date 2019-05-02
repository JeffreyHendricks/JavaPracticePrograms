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
public class CommaSeparatedValuesFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CSVFileReader cF = new CSVFileReader();
        
        cF.setTextFile("C:\\Users\\jeff\\Documents\\javaText\\CSVFile.txt");
        cF.readFile();
        
    }
    
}
