package java2;

public class InvalidGeometricalDimensionException extends IllegalArgumentException{
    public InvalidGeometricalDimensionException(){
        super("Geometrical dimensions must be greater than zero");
    }
    public InvalidGeometricalDimensionException(String message){
        super(message);
    }
}