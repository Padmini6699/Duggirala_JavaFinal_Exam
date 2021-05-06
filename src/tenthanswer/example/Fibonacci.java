/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenthanswer.example;

/**
 *
 * @author Padmini Duggirala
 */
public class Fibonacci {
    static int val1=0,val2=1,val3=0;      
     static void Recursion(int count){      
        
         if(count>0){      
             
            val3 = val1 + val2;      
             
             val1 = val2;      
             
             val2 = val3;      
             
             System.out.print(" "+val3);     
             
             Recursion(count-1);      
         }      
     }        
  
public static void main(String[] args) {  
    System.out.println("Answer for Question10: Padmini Duggirala");
    
    int count=15;      
     
    System.out.print(val1+" "+val2);
     
      Recursion(count-2);
}  
}  

