
    import java.util.*;
    class Hello 
    {
      void sayHello()
      {
        System.out.println("Hello");
      }
      void sayHello(String str)
      {
        System.out.println("Hello "+str);
      }
    }
    public class method_overloading_2
    {
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Hello s = new Hello();
        s.sayHello();
        s.sayHello(str);
      }
    }
