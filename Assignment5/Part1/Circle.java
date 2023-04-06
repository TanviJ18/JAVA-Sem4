package Assignment5.Part1;

public class Circle implements Shape {
    float area,perimeter,rad;

    public Circle(float i){
        rad=i;
    }

    @Override
    public float calculateShapeArea() {
        area=(float)(Math.PI*Math.pow(rad,2));
        return (float)area;
    }

    @Override
    public float calulateShapePerimeter() {
        perimeter=(float)(2+Math.PI*rad);
        return perimeter;
    }

    public String toString(){
        return "Dimension of Shape "+rad+" Area of Shape "+area+" Perimeter of Shape "+perimeter;
    }
}
