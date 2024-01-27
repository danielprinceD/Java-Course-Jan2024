import java.util.*;
public class port_pattern_4 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j>=1;j--)
                 System.out.print(j);
             System.out.println();
         }
     }
}