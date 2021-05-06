/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightanswer;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Padmini Duggirala
 */
public class Example2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for Question8 Example2: Padmini Duggirala");
        
      
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\S542358\\OneDrive - nwmissouri.edu\\Desktop\\file.txt"));
            
                String s = scan.nextLine();
                if(!scan.hasNext()){
                    throw new EOFException("End of file exception");
                }
            
        } 
        catch(EOFException Ex){
            System.out.println(Ex);
        }
    }
}
   
