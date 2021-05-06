/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleventhanswer;

import java.util.Objects;

/**
 *
 * @author Padmini Duggirala
 */
public class Goggles {
    private String companyName;
    private int price;
    private String colour;

    /**
     *
     * @param companyName
     * @param price
     * @param colour
     */
    public Goggles(String companyName, int price, String colour) {
        this.companyName = companyName;
        this.price = price;
        this.colour = colour;
    }

    /**
     *
     * @return The get Method returns the Company Name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     *
     * @return The get Method returns the  Price
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @return The get method returns the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.companyName);
        hash = 29 * hash + this.price;
        hash = 29 * hash + Objects.hashCode(this.colour);
        return hash;
    }

    /**
     *
     * @param obj
     * @return equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Goggles other = (Goggles) obj;
        if (this.price==other.price) {
          return true;
    }
     if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.colour, other.colour)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return to string
     */
    @Override
 public String toString() {
        return "Shoes{" + "brandName=" + companyName + ", ID=" + price + ", colour=" + colour + '}';
    }

}