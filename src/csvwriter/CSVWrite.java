/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csvwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author John
 */
public class CSVWrite {
    
    private PrintStream prnStrm;
    
    public CSVWrite(String filePath) throws FileNotFoundException{
        prnStrm = openFile(filePath);
    }
    
    public PrintStream openFile(String fpth) throws FileNotFoundException{
        
        //This is se dependent will need to change for robot
        File f = new File(fpth);
        FileOutputStream fs = new FileOutputStream(f);
        return new PrintStream(fs);
    }
    
    public int writeToFile(double [] dblout){
        int i;
        for(i =0; i< dblout.length-1;i++){
            prnStrm.print("" + dblout[i] + ",");
        }
        prnStrm.println(dblout[i]);
        return i;
    }
    
    public void close(){
        prnStrm.close();
    }
    
}
