/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlevelconsole;
import java.io.InputStreamReader;
import java.io.*;

        
/**
 *
 * @author MIDO
 */
public class HighLevelConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            // Please Choose the location where you want to save the output file
            FileWriter fw = new FileWriter("F:\\Iti\\Foundation period\\Java & UML programming\\Lecs\\test.txt");
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            BufferedWriter bw = new BufferedWriter(fw);
            String x;
            do{
                System.out.println("Enter data:");
                x=br.readLine();
                if(!x.equalsIgnoreCase("stop")){
                    bw.write(x);
                    bw.newLine();
                }
                System.out.println("Data is "+x);
                }
            while(!x.equalsIgnoreCase("stop"));
            System.out.println("Finished");
            bw.close();
            fw.close();
            br.close();
            }
        catch( IOException ex){
            ex.printStackTrace();
        }
    }
    
}
