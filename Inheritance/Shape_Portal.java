package Inheritance;

import java.util.Scanner;

abstract class Shape
{
    double area,peri;
    abstract public void setLengthAndWidth(double l,double w);
    abstract void display();
    
}
class Square extends Shape
{
    public void setLengthAndWidth(double l,double w)
    {
        super.area = l*l;
        super.peri = 4*l;
    }
    void display()
    {
        System.out.printf("Perimeter : %.2f",peri);
        System.out.printf("Area : %.2f",area);
    }
}
class Triangle extends Shape
{
    public void setLengthAndWidth(double a  ,double b)
    {

    }
    public void setPoints(double a , double b , double c)
    {
        super.area = a * b * c; 
    }
    void display()
    {
        System.out.printf("Perimeter : %.2f",peri);
        System.out.printf("Area : %.2f",area);
    }
}
class Rectangle extends Shape
{
    double len,wid;
    public void setLengthAndWidth(double l,double w)
    {
        this.len = l;
        this.wid = w;
    }
    void display()
    {
        System.out.printf("Perimeter : %.2f",peri);
        System.out.printf("Area : %.2f",area);
    }
}
class Circle extends Shape
{
    double rad;
    public void setLengthAndWidth(double r, double b)
    {
        rad = r;
        super.area = Math.PI * r * r;
        super.peri = Math.PI * 2 * r;
    }
    void display()
    {
        System.out.printf("Perimeter : %.2f",peri);
        System.out.printf("Area : %.2f",area);
    }
}
public class Shape_Portal {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        char type = s.next().charAt(0);
        if(type=='S')
        {   
            double side = s.nextDouble();
            Shape sq =  new Square();
        sq.setLengthAndWidth(side,0);;
        sq.display();
        
    }
    else if(type== 'R')
    {
        double len,bre;
        len = s.nextDouble();
        bre = s.nextDouble();
        Shape rec = new Rectangle();
        rec.setLengthAndWidth(len, bre);
        rec.display();
    }
    else if(type== 'C')
    {
        Shape cir = new Circle();
        double rad = s.nextDouble();
        cir.setLengthAndWidth(rad, 0);
        cir.display();
    }
    
}
}
