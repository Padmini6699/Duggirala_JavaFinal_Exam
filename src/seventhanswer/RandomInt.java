/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhanswer;

import java.util.Scanner;

/**
 *
 * @author Padmini Duggirala
 */
public class RandomInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);   

		
		int[] array = getArray();  

		System.out.println("Answer for question 7: Padmini Duggirala");
		System.out.print("Enter the index of the array:");  
                                       
		try {
			
			System.out.println("The corresponding element value is " + 
				array[scan.nextInt()]); 
		}

		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of Bounds");
		}
	}

	

	public static int[] getArray() {
		int[] array = new int[100];
		for (int a = 0; a < array.length; a++) {
			array[a] = (int)(Math.random() * 100) + 1;
		}
		return array;
    }
    
}

