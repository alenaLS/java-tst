package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("somebody");

        Square s = new Square(5);
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +" = " + r.area());

        Point p1 = new Point(3,4);
        Point p2 = new Point(0,0);

        System.out.println(distance(p1, p2));
        System.out.println(p1.distance(p2));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double distance(Point p1, Point p2){
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}