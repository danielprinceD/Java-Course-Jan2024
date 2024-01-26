import java.util.*;
public class Main{
  public static void main(String args[])
  {
    int a,b,c,tre,code;
    Scanner s = new Scanner (System.in);
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    if(a>b && a > c)
    {
      if(b>c){tre = b;code = c;}
      else{tre = c;code = b;}
    }else if(b > c)
    {
      if(a>c){tre = a;code = c;}
      else{tre = c;code = a;}
    }
    else
    {
      if(a>b){tre = a;code = b;}
      else{tre = b;code = a;}
      
    }
    System.out.println("The treasure is in the box which has number "+tre+".");
    System.out.print("The code to open the box is "+code+".");
      
  }
}