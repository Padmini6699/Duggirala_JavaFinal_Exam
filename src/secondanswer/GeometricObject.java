/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondanswer;

/**
 *
 * @author Padmini Duggirala
 */
public class GeometricObject {
    private String geoName;
    private int noOfSides;

    public GeometricObject(String geoName, int noOfSides) {
        this.geoName = geoName;
        this.noOfSides = noOfSides;
    }

    public String getGeoName() {
        return geoName;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    @Override
    public String toString() {
        return "The geometric object is " + this.geoName
                + " and "+ this.getGeoName() +" is not colorable.";

    }
    
}
