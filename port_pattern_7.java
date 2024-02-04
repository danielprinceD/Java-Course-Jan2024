import java.util.*;
class port_pattern_7
  {
    public static void main(String []args)
    {
      int num;
      Scanner s = new Scanner(System.in);
      num = s.nextInt();
      for(int i=num;i>=1;i--)
        {
          for(int j=i;j<=num;j++)
            {
              System.out.print(j);
            }
          System.out.println();
        }
    }
  }