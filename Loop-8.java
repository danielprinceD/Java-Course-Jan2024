import java.util.*;
class Main
  {
public static void main(String args[])    
{
    int num,val1=10,val2=5;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    for(int i=1;i<=num;i++)
    {
        if(i%2!=0)
        {
        System.out.print(val1+" ");
        val1 = val1+50;
        }
        if(i%2==0)
        {
        System.out.print(val2+" ");
        val2 = val2+10;
            
        }
    }
    
  }
}
