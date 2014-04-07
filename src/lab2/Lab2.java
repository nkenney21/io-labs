

package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab1.Lab1;

/**
 *
 * @author neilkenney
 */
public class Lab2 {
    public static void main(String[] args) throws IOException {
        
        File data = new File("src" + File.separatorChar + "address.txt");
        
        BufferedReader in = null;
        Scanner record = new Scanner(System.in);
        int recordSelected;
        int lineCount = 0;
        int recordCount = 0;
        
        try{
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            lineCount = 1;
            while(line != null){
                lineCount++;
                line = in.readLine();
            }
            recordCount = lineCount/7;
        }catch(IOException ioe){
            System.out.println("No data in file");
        }
        
       System.out.println("Choose a record");
        recordSelected = record.nextInt();
        if(recordSelected < 0 || recordSelected > recordCount){
            throw new IOException("Selection must be greater than 0 and less than or equal to " + recordCount);
        }

        
        
        try{
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            int x = 0;
            while(line != null){
                if(x >= ((recordSelected - 1)*8)&& x < (8 * recordSelected)){
                    System.out.println(line);
                }
                line = in.readLine();
                x++;
            }
        }catch(IOException ioe){
            System.out.println("Error");
            
        }finally{
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
