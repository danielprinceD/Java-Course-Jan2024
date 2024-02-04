import java.util.Arrays;
import java.util.Scanner;

public class median_array {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int[] a = new int[num];
        for(int i=0;i<a.length;i++)
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        if(num%2!=0)
            System.out.println((double)a[(num/2)]);
        else
            System.out.println((double)a[(num/2)]+a[(num/2)+1]);

    }
}
