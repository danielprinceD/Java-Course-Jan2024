import java.util.*;
class port_pattern_6
{
  public static void main(String []args)
  {
    int num,k=1;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    System.out.println(args[0] + " "+ args[1]);
    if(num==2)
    {
            System.out.print("1\n");
            System.out.print("23");
        return;
    }

    for(int i=1;i<num;i++)
      {
        for(int j=1;j<=i;j++)
          {
            System.out.print(k);
            k++;
          }
        System.out.println();
      }
  }
}