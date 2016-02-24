package by.stqa.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Point p1 = new Point(-7,2);
        Point p2 = new Point(-1,0);

        System.out.println("Расстояние между точками = " + p1.distance(p2));

    }

/* the function is moved to class Point
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }*/
}