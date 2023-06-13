package Repaso3Ev.Ej2A;

public class PointTester {
    public static void main(String[] args) {
        Point point = new Point(2.5, 4.1);

        System.out.println("Point 1: "+ point );
        point.invertirCoordinates();
        System.out.println("La coordenada X es " + point.getX());
        point.setX(0);
        System.out.println( "Point 1: "+ point);
/*  PARA INVERTIRLO NORMAL
        System.out.println(point);
        point.invertirCoordinates();
        System.out.println(point);
*/
    }
    
}
