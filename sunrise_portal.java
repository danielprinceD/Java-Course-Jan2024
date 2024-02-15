import java.util.Scanner;

class Product
{
    double deposit,costPerDay;
    String name;
    public void setDeposit(double deposit){ this.deposit=deposit; }
    public void setCostPerDay(double cpd){ this.costPerDay=cpd; }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Deposit Amount : "+ deposit);
        System.out.println("Cost per day : "+ costPerDay);
    }

}
public class sunrise_portal {
    public static void main(String[] args) {
        Product pr = new Product();
        Scanner s = new Scanner(System.in);
        pr.name = s.next();
        double dp = s.nextDouble();
        double costPerDay;
        costPerDay = s.nextDouble();
        pr.setDeposit(dp);
        pr.setCostPerDay(costPerDay);
        pr.display();
        
    }
}
