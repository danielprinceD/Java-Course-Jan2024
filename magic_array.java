import java.util.Scanner;

public class magic_array {
    public static void main(String[] args) {
        int size,row_sum=0,col_sum=0;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int [][]a = new int[size][size];
        for(int i=0;i<a.length;i++)
            for(int j =0;j<a.length;j++)
                a[i][j] = s.nextInt();
        
        int diag_r = 0;
        int diag_l = 0;
        boolean fail = false;
        int len = a.length-1;
        for(int i=0;i<a.length;i++)
        {
            row_sum= 0;col_sum=0;
            diag_l += a[i][i];
            diag_r += a[len-i][i];
            for(int j =0;j<a.length;j++)
            {
                row_sum+=a[i][j];
                col_sum +=a[j][i];
                
            }
            if( (row_sum - col_sum ) !=0)
            {
                fail = true;
            }
        }
        if(fail == true && diag_l !=diag_r)
            System.out.println("no");
        else
            System.out.println("yes");
            
        

    }
}
