import java.util.*;
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int res[][] = new int[rowSum.length][colSum.length];
        
        int ROW = rowSum.length;
        int COL = colSum.length;
        
        for(int r = 0;r < ROW; r++)
        {
            for(int c=0;c<COL;c++)
            {
                res[r][c] = Math.min(rowSum[r] , colSum[c]);
                rowSum[r] -= res[r][c];
                colSum[c] -= res[r][c];
            }
        }
        
        for(int[] a : res)
        {
            for(int b : a)
                System.out.print(b);
            System.out.println();
        }
        
        return res; 
    }
}
public class Main
{
	public static void main(String[] args) {
        new Solution().restoreMatrix(new int[]{5 , 7 , 10 } , new int[] {  8 , 6 , 8  }  );
	}
}