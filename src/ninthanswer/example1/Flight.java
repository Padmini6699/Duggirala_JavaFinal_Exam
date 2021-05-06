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
public class Flight  {
         public int flightTicket(int price) {
        if (price <= 145) {
            throw new ArithmeticException("price should be atleast $145.");

        } else {
            return 1;
        }
    }

}


