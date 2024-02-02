import java.util.Scanner;

public class upper_triangular {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int [][]a = new int[size][size];
        for(int i=0;i<a.length;i++)
            for(int j =0;j<a.length;j++)
                a[i][j] = s.nextInt();
        boolean fail = false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i][j] !=0)
                    fail = true;
            }
        }
        if(fail == true)
        System.out.println("no");
        else
        System.out.println("yes");
    }
}
