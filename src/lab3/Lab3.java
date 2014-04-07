

package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neilkenney
 */
public class Lab3 {
    public static void main(String[] args) {
        
        File data = new File("src" + File.separatorChar + "address.txt");
        
        BufferedReader in = null;
        
       
        
        try{
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            int x = 0;
            while(line != null){
                if(x == 11){
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
                Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
