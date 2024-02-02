import java.util.Scanner;

public class max_element_matrix {
    public static void main(String[] args) {
        int c,r,max = 0;
        Scanner s = new Scanner(System.in);
        c = s.nextInt();
        r = s.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
              {
                  arr[i][j] = s.nextInt();
                  max = Math.max(max, arr[i][j]);
              }  
        System.out.println(max);
    }
}
