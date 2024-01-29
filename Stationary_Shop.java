import java.util.*;
public class Main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      String str;
      int stock,price,cust,tot;
      str = s.nextLine();
      stock = s.nextInt();
      price = s.nextInt();
      cust = s.nextInt();
      tot = cust * price;
      if(stock < cust)
        System.out.print("Out of stock");
      else
        System.out.print(tot + " " + (stock - cust));
    }
  }