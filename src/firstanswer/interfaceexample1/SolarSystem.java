/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstanswer.interfaceexample1;

/**
 *
 * @author Padmini Duggirala
 */
public interface SolarSystem {
    int speed = 460;
	void planet();

 }

 class Galaxy implements SolarSystem
{
        @Override
	public void planet()
	{
	    System.out.println("Answer for Question1 Example1: Padmini Duggirala");
            System.out.println("Sun is at the centre of the solar system");
	}

	public static void main (String[] args)
	{
		SolarSystem obj = new Galaxy() ;
		obj.planet();
		System.out.println(speed);
	}
}

