import java.util.Scanner;

public class port_pattern_5 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j<=n;j++)
                 System.out.print(j);
             System.out.println();
         }
     }
    }
