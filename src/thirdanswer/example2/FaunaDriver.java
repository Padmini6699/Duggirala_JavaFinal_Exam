/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdanswer.example2;

/**
 *
 * @author Padmini Duggirala
 */
public class FaunaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Answer for Question3 Example2: Padmini Duggirala");
        double d=10;
        System.out.println("age of the insect: " +d);
        int i=(int)5.6;
        System.out.println("No of legs of the insect: "+i);
        Fauna p= new Fauna("Cockroach", 4);

        Insects in = new Insects("DragonFly",9,"Africa");
        p = in;
        in = (Insects)p;
        System.out.println(in);
        
         
    }
    
}
