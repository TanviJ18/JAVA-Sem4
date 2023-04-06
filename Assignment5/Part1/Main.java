package Assignment5.Part1;

public class Main {
    public static void main(String[] args){
        Circle c = new Circle(5);
        c.calculateShapeArea();
        c.calulateShapePerimeter();
        System.out.println(c);

        Square s = new Square(5);
        s.calculateShapeArea();
        s.calulateShapePerimeter();
        System.out.println(s);


        Rectangle r = new Rectangle(4,5);
        r.calculateShapeArea();
        r.calulateShapePerimeter();
        System.out.println(r);


        Triangle t = new Triangle(3,4);
        t.calculateShapeArea();
        t.calulateShapePerimeter();
        System.out.println(t);

    }
}
