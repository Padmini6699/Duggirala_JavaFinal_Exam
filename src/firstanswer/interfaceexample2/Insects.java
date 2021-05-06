/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstanswer.interfaceexample2;

/**
 *
 * @author Padmini Duggirala
 */
public interface Insects {
    float size = 3;
	void habitat();

 }

 class worms implements Insects
{
        @Override
	public void habitat()
	{
	    System.out.println("Answer for Question1 Example2: Padmini Duggirala");	
            System.out.println("Major part of the insects' diet consists of worms ");
	}

	public static void main (String[] args)
	{
		Insects obj = new worms();
		obj.habitat();
		System.out.println("The size of an average insect is " + size + " cm");
	}
 }
