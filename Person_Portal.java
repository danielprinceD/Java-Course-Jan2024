import java.util.Scanner;

class Person
{
    String name;
    int age;
    Person()
    {
        Scanner s = new Scanner(System.in);
        this.name = s.nextLine();
        this.age = s.nextInt();
        System.err.println("Name "+ this.name + " with age " + this.age);
    
    }
   
}

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for(int i=0;i<size;i++)
        {
            Person p = new Person();
        }
    }
}
