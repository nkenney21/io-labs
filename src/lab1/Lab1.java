

package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neilkenney
 */
public class Lab1 {

    public static void main(String[] args) throws IOException {
        
        File data = new File("src" + File.separatorChar + "address.txt");
        
        BufferedReader in = null;
        
        // Part 1
        
//        try{
//            in = new BufferedReader(new FileReader(data));
//            String line = in.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = in.readLine();
//            }
//        }catch(IOException ioe){
//            System.out.println("Error");
//            
//        }finally{
//            try {
//                in.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
           
        // Part 2
        
        
//        try{
//            in = new BufferedReader(new FileReader(data));
//            String line = in.readLine();
//            int x = 0;
//            while(line != null){
//                if(x > 7 && x < 16){
//                    System.out.println(line);
//                }
//                line = in.readLine();
//                x++;
//            }
//        }catch(IOException ioe){
//            System.out.println("Error");
//            
//        }finally{
//            try {
//                in.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
        // part 3
        PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(data, true)));
        
            out.println("Mary");
            out.println("Johnson");
            out.println("424 Banana Street");
            out.println("Lannon");
            out.println("WI");
            out.println("53046");
            out.println("mary@gmail.com");
            out.println("2627778888");
            out.close();
        
        try{
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while(line != null){
                System.out.println(line);
                line = in.readLine();
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
