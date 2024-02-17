import java.util.Scanner;

class Dog
{
    String name,breed;
    public String getBreed()
    {
        return breed;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void display()
    {
        String behave;
        if(this.getBreed().equals("Labrador"))behave="arrogant";
        else behave = "nice";
        System.err.println(this.name +" is a "+ this.getBreed()+" which is "+behave);
    }
}
public class Dogs_portal {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        Dog d[] = new Dog[num];
        String name,breed;
        for(int i=0;i<num;i++)
        {
            name = s.next();
            d[i] = new Dog();
            d[i].setName(name);
            breed = s.next();
            d[i].setBreed(breed);
        }
        for(int i=0;i<num;i++)
            d[i].display();

    }
}
