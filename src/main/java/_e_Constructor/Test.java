package _e_Constructor;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println("Coordinates of object 'point' are: ");
        System.out.println("x: " + point.x);
        System.out.println("y: " + point.y);

        Point point1 = new Point(point);
        System.out.println("\nCoordinates of object 'point1' are: ");
        System.out.println("x: " + point1.x);
        System.out.println("y: " + point1.y);
    }
}
