/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthanswer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Padmini Duggirala
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        System.out.println("Answer for Question 6 Checked Exceptions: Padmini Duggirala");
        Scanner sc = new Scanner(new File("data.txt"));

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

}

