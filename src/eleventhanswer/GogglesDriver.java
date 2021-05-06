/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleventhanswer;

/**
 *
 * @author Padmini Duggirala
 */
public class GogglesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("Answer for Question11: Padmini Duggirala");
        Goggles g1 = new Goggles("gucci", 400, "black");
        //Created object for Googles Class
        Goggles g2 = new Goggles("versace", 6000, "white");
        //Created object for Googles Class
        Goggles g3 = new Goggles("ray-ban", 900, "green");
        System.out.println("*******Equals Method*******");
        //comparing g1 and g2 objects attributes with equals method
        System.out.println(g1.equals(g2));
        //comparing g2 and g3 objects attributes with equals method
        System.out.println(g2.equals(g3));
        //comparing g3 and g1 objects attributes with equals method
        System.out.println(g3.equals(g1));
        System.out.println("*******HashCode Method*******");
        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());
        System.out.println(g3.hashCode());
    }

}
    
    

