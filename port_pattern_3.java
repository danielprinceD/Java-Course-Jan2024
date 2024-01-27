import java.util.*;
public class port_pattern_3 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
         for(int i=n;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
                 System.out.print(i);
             System.out.println();
         }
     }
}
