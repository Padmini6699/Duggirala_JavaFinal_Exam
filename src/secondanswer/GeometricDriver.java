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
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to Question2: Padmini Duggirala");
        GeometricObject[] geometricArray = new GeometricObject[5];
        Square s1 = new Square(true, 8, "Square1", 4);
        Square s2 = new Square(false, 2, "Square2", 4);
        GeometricObject s3 = new Square(false, 5, "Square3", 4);
        GeometricObject s4 = new Square(true, 5.9, "Square4", 4);
        GeometricObject s5 = new Square(true, 6, "Square5", 4);
        geometricArray[0] = s2;
        geometricArray[1] = s1;
        geometricArray[2] = s5;
        geometricArray[3] = s4;
        geometricArray[4] = s3;

        for (GeometricObject geo : geometricArray) {
            Square ss = (Square) (geo);
            if (ss.isColorable()) {
                ss.howToColor();
                System.out.println("The Area of " + ss.getGeoName() + " is " + Math.round(ss.calcArea() * 100) / 100.0);
            } else {
                System.out.println(geo);

            }
        }

    }


}
