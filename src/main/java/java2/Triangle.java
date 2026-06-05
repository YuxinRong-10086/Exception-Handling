package java2;

public class Triangle implements Shape{
        private double length;
        public Triangle(double length){
            this.length = length;
            if(length <=0){
                throw new InvalidGeometricalDimensionException();
            }
        }

        @Override
        public double getArea(){
            return length * Math.sqrt(3)/2;
        }

        @Override
        public double getPerimeter(){
            return length * 3;
        }

    }
