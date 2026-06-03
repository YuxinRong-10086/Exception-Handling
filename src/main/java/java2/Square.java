package java2;

public class Square implements Shape {
    private double side;


    public Square(double side){
        if (side <=0){
            throw new InvalidGeometricalDimensionException();

        }
        this.side = side;
    }
    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
