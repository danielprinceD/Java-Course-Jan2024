class Shape
{
    double area;
    void show_area()
    {
        System.out.println("Area is " + area);
    }
}
class Circle extends Shape
{
    Circle(double rad)
    {
        this.area = rad * 3.141;
    }
}
class Square extends Shape
{
    Square(double rad)
    {
        this.area = rad * rad;
    }

}
public class shape_inherit {
    public static void main(String[] args) {
        Square s = new Square(20);
        s.show_area();
        Circle c = new Circle(20);
        c.show_area();
    }
}
