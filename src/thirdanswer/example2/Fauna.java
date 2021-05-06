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
public class Fauna {
    private String name;
    private int age;

    public Fauna(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
         return  "insect name= " + name + ", insect age= " + age ;
    }
}


   