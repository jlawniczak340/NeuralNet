/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csvwriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author John
 */
public class CSVRead {
    private FileInputStream fin;
    
    //not neccessary
    private String Line;
    private boolean isEof;
    
    public CSVRead(String fle) throws FileNotFoundException, IOException{
        fin = new FileInputStream(fle);
    }
    
    public double[] getNextLine() throws IOException{
        
        double [] ret = new double[11];
        
        char c = (char)fin.read();
        
        String line ="";
        isEof = true;
        do{
            if(c=='\n'){
                isEof = false;
                break;
            }
            line += c;
        }while((c = (char)fin.read()) != -1);//stop if we get to eof
        
        String [] lines = line.split(",");
        
        
        //get each double
        for(int i=0; i< lines.length; i++){
            ret[i] = Double.parseDouble(lines[i]);
        }
        
        return ret;
    }
    
    public boolean hasNextLine(){
        return isEof;
    }
}
