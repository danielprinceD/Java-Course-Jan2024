class Shape
{
    double area=0;
    String name;
    void show_area()
    {
        System.out.println("Area of "+ name+" is " + area);
    }
}
class Circle extends Shape
{
    Circle(double rad)
    {
        this.name = "Circle";
        this.area = rad * 3.141;
    }
}
class Square extends Shape
{
    Square(double rad)
    {
        this.name = "Square";
        this.area = rad * rad;
    }

}
class Rectangle extends Shape
{
    Rectangle(int len ,int bre)
    {
        this.name = "Rectangle";
        this.area = len * bre;
    }
}
public class shape_inherit {
    public static void main(String[] args) {
        Square s = new Square(20);
        s.show_area();
        Circle c = new Circle(20);
        c.show_area();
        Rectangle r = new Rectangle(20, 10);
        r.show_area();


    }
}