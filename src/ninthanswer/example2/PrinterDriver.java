/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthanswer.example2;

/**
 *
 * @author Padmini Duggirala
 */
public class PrinterDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Answer to Question9 Example2: Padmini Duggirala");
        try {
            Printer k = new Printer();

          
            int noOfcolors = 40;

            if (noOfcolors > 25) {
                throw new IllegalArgumentException("Number of colors should not be greater than 25");
            } else {
                System.out.println(k.ink(25));
            }
        } catch (ArithmeticException Ex) {
            System.out.println(Ex.getMessage());
        } catch (RuntimeException Ex) {
            System.out.println(Ex.getMessage());
        }

    }
    
}
