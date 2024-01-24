import java.util.Scanner;
class Main{
 public static void main(String args[])
{
    int num;
    Scanner s = new Scanner(System.in);
    num= s.nextInt();
    for(int i=1;i<=num;i++)
    {
        System.out.print((int)Math.pow(i,i) + " ");
    }
    
}

}