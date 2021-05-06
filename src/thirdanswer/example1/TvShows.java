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
public class TvShows {
    private String name;
    private int year;

    public TvShows(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
       return  "Lasya got best anchor award for the tvshow " + name + ", in the year " + year +",";
    }

    
}
