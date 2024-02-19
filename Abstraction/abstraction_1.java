package Abstraction;

import java.util.Scanner;

abstract class Shape
{
    double len,bre,rad,side;
    abstract void squareArea();
    abstract void rectangleArea();
    abstract void circleArea();
    Shape(double len, double bre)
    {
        this.len=len;this.bre = bre;
    }
    Shape(double r)
    {
        this.rad = r;
    }
    Shape(double s,String n)
    {
        this.side = s;
    }
}
class Rect extends Shape
{
    Rect(double len , double wid)
    {
        super(len , wid);
    }
    public void rectangleArea()
    {
        System.out.println((int)(len * bre));
    }
    public void squareArea(){}
    public void circleArea(){}
}
class Square extends Shape
{
    
    Square(double s, String n)
    {
        super(s , n);

    }
    public void rectangleArea(){}
    public void squareArea(){System.out.println( (int)(side* side));}
    public void circleArea(){}
}
class Circle extends Shape
{
    Circle(double rad)
    {
        super(rad);
    }
    
    public void rectangleArea(){}
    public void squareArea(){}
    public void circleArea(){System.out.printf("%.2f",Math.PI * rad * rad);}
}
public class abstraction_1 {
    public static void main(String[] args) {
        double len,bre,side,rad;
        Scanner s = new Scanner(System.in);
        len = s.nextDouble();      
        bre = s.nextDouble();
        side = s.nextDouble();
        rad = s.nextDouble();
        Shape rec = new Rect(len , bre);
        Shape sq = new Square(side , "s");
        Shape cir = new Circle(rad);
        rec.rectangleArea();
        sq.squareArea();
        cir.circleArea();
    }
}
