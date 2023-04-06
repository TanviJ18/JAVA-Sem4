package Assignment5.Part1;

public class Square implements Shape {
    float area,perimeter,side;

    public Square(float i){
        side=i;
    }

    @Override
    public float calculateShapeArea() {
        area=(float)(side*side);
        return (float)area;
    }

    @Override
    public float calulateShapePerimeter() {
        perimeter=(float)(4*side);
        return perimeter;
    }

    public String toString(){
        return "Dimension of Shape "+side+" Area of Shape "+area+" Perimeter of Shape "+perimeter;
    }
}
