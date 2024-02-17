package Inheritance;
abstract class A
{
    abstract void print();
}
class B extends A
{
    void print()
    {
        System.out.println("Hello");
    }
}
class C extends A
{

    void print()
    {
        System.out.println("Hello C");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        A a = new B();
        A c = new C();
        a.print();
        c.print();
        Object o = 10.0;
        System.out.println();

    }
}
