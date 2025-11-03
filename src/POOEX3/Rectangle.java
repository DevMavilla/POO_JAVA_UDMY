package POOEX3;

public class Rectangle {
    public double width;
    public double height;

    public double calcArea(){
        return  width * height;
    }

    public double calcPerimeter(){
        return 2 * (width + height);
    }

    public double calcDiagonal(){
        return Math.sqrt(width * width + height * height);
    }

    public String toString(){
        return String.format("Area = %.2f%n",calcArea())
             + String.format("Perimetro = %.2f%n",calcPerimeter())
             + String.format("Diagonal = %.2f%n",calcDiagonal());
    }
}
