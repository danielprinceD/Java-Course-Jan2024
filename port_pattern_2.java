import java.util.*;
public class port_pattern_2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
         for(int i=n;i>=1;i--)
         {
             for(int j=n;j>=i;j--)
                 System.out.print(j);
             System.out.println();
         }
     }
}
