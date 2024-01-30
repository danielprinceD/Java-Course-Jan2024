import java.util.Scanner;

public class port_pattern_14 {
    public static void main(String args[])
{

    int num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    for(int i=1; i<=num;i++)
    {
        for(int j=1; j<=i;j++)
        {System.out.print((char) (j + 96));}
        
        System.out.println();
    }
}
}
