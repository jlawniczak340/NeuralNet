/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csvwriter;

import java.io.*;



/**
 *
 * @author John
 */
public class CSVWriter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CSVWrite writer = new CSVWrite("test.csv");
            for(int i=0; i < 100; i++){
                writer.writeToFile(getRandomNumbers(11));
            }
            writer.close();
            
            
            CSVRead read = new CSVRead("test.csv");
            while(read.hasNextLine()){
                System.out.println(read.getNextLine());
            }
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        
    }
    
    public static double getRandomNumber(){
        return Math.random() * 20 -10;
    }
    
    public static double [] getRandomNumbers(int num){
        double [] ret = new double [num];
        
        for(int i=0; i<num;i++){
            ret[i] = getRandomNumber();
        }
        
        return ret;
    }
}
