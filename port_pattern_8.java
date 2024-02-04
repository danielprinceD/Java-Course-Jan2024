import java.util.Scanner;
public class port_pattern_8
  {
    public static void main(String[] args)
    {
      int num,val=0;
      Scanner s = new Scanner(System.in);
      num = s.nextInt();
      for(int i=1;i<=num;i++)
        {
          for(int j=1;j<=i;j++)
            {
              if(j%2==0)
                System.out.print("0");
              else
                System.out.print("1");
                
            }
          System.out.println();
        }
    }
  }