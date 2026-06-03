package java2;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        if(radius <=0){
            throw new InvalidGeometricalDimensionException();
        }
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2* Math.PI *radius;
    }
}