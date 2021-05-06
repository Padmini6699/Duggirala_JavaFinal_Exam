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
public class Anchor extends TvShows {
    private String shows;
    
    public Anchor(String name, int year, String shows) {
        super(name, year);
        this.shows=shows;
    }

    @Override
    public String toString() {
        return super.toString()+ " Now Lasya is working as an anchor in " + shows ;
    }

    
    

    
}
