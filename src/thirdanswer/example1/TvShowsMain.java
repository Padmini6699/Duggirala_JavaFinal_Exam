/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdanswer.example1;

/**
 *
 * @author Padmini Duggirala
 */
public class TvShowsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question3 Example1: Padmini Duggirala");
        int i=(int)7.9;
        System.out.println("number of votes for the something special show: "+i);
        TvShows w= new TvShows("Comedy club",2018);
        System.out.println("Ravi is the co anchor for that show.");
        Anchor ch= new Anchor("Something special", 2002, "Fun gang");
        w=ch;
        ch=(Anchor)w;
        System.out.println(ch);
        
    }
    
}



