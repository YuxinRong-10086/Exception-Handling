package java2;

public class ShapeTester{


    public static void main(String[] args){
        try{
            Shape square = new Square(-5);
            System.out.println(square.getArea());
            System.out.println(square.getPerimeter());
        }
        catch(InvalidGeometricalDimensionException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        Shape circle = new Circle(3);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Shape triangle = new Triangle(5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter" + triangle.getPerimeter());
    }
}