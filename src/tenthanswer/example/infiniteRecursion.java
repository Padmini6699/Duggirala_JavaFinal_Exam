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
public class infiniteRecursion {


     static int list[] = {12, 34, 54, 2, 3};


     static int recursionSearch(int list[], int l, int r, int x)

     {

          if (r < l)

             return -1;

          if (list[l] == x)

             return l;

          if (list[r] == x)

             return r;

          return recursionSearch(list, l+1, r-1, x);

     }

      

     public static void main(String[] args) {
       System.out.println("Answer for Question10: Padmini Duggirala");

     {

        int x = 3;

         

       

        int index = recursionSearch(list, 0, list.length-1, x);

        if (index != -1)

           System.out.println("Element " + x + " is present at index " +index);

        else

            System.out.println("Element " + x + " is not present");

        }
     }
}
