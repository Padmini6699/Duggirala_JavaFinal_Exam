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
public class Insects extends Fauna{
     private String nativeOfTheInsect;

    public Insects(String name, int age, String nativeOfTheInsect) {
        super(name, age);
        this.nativeOfTheInsect = nativeOfTheInsect;
        
        
       
    }

    @Override
    public String toString() {
        return super.toString() + ", nativeOfTheInsect= " + nativeOfTheInsect ;
    }
}

       
