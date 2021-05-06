/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstanswer.abstractexample1;

/**
 *
 * @author Padmini Duggirala
 */
public class Eclipse extends IDE{
    public Eclipse () {

    }

    @Override
    public String name() {
        return "The Eclipse IDE is famous for our Java Integrated Development Environment ";
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question1 Example1: Padmini Duggirala");
        IDE j = new Eclipse();
        System.out.println("It is used for developing applications using the Java programming language and other programming languages" + "\n" + j.name());
    }

}
    
