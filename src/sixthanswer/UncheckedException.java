/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthanswer;

import java.util.Scanner;

/**
 *
 * @author Padmini Duggirala
 */
public class UncheckedException {

    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a =sc.nextInt();
        System.out.println("Enter B: ");
        int b= sc.nextInt();
        int c = a/b;
        System.out.println("Division = "+c);
        System.out.println("rest of the code");
        System.out.println("Program continue");
    }
    
}
