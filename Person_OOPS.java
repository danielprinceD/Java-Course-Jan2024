import java.util.Scanner;
class Person {    
    String name;int age; 
    Person()
    {
    Scanner s = new Scanner(System.in);
    this.name = s.next();
    this.age = s.nextInt();
  }
  void show()
  {
    System.out.println("Name "+ this.name + " with age "+ this.age); 
  }
}
public class Person_OOPS { 
  public static void main(String[] args) {  
    Scanner s = new Scanner(System.in);      
    int size = s.nextInt();

    Person p[] = new Person[size];
    for(int i=0;i<size;i++)
      {
        p[i] = new Person(); 
      }
    for(int i=0;i<size;i++)
      p[i].show();
  }
}
