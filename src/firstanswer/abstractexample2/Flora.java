/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstanswer.abstractexample2;

/**
 *
 * @author Padmini Duggirala
 */
public class Flora extends Garden{
    public Flora () {

    }

    @Override
    public String name() {
        return "Flora is all the plant life present in a particular region ";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for Question1 Example2: Padmini Duggirala");
        Garden j = new Flora();
        System.out.println("The flora liberates oxygen that is consumed by the fauna" + "\n" + j.name());
    }

}
    