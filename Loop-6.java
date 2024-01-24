import java.util.Scanner;
class Main{
public static void main(String args[])
{
    int num,it=2;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    for(int i=0;i<num;i++)
    {
        System.out.printf("%d ",it);
        it = (it*2) -i;
    }
}
}
