import java.util.Scanner;

public class Twod_matrix_sum
{
    public static void main(String[] args) {
     int r,c;
     Scanner s= new Scanner(System.in);
     r = s.nextInt();c = s.nextInt();
     int[][] a = new int[r][c];
     int ans=0;
     for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        {
            a[i][j] = s.nextInt();
            ans+=a[i][j];
        }
        System.out.println(ans);
    }
}