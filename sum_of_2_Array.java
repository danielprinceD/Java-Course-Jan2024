import java.util.Scanner;

public class sum_of_2_Array {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] = s.nextInt();
        }
        for(int i=0 ;i<size;i++)
        {
            b[i] = s.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]+b[i]);
        }
    }
}
