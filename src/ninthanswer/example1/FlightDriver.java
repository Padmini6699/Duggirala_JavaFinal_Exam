/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthanswer.example1;

/**
 *
 * @author Padmini Duggirala
 */
public class FlightDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        System.out.println("Answer to Question9 Example1: Padmini Duggirala");
        try {
            Flight F = new Flight();
            System.out.println(F.flightTicket(345));
            System.out.println(F.flightTicket(56)); 
        } catch (ArithmeticException Ex) {
            System.out.println(Ex.getMessage());
        }
    }

}


