import java.util.*;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashSet<Integer> hash = new HashSet();
        List<Integer > ans = new ArrayList();
        for(int i=0;i<matrix.length;i++)
        {
            int temp = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
                temp = Math.min(temp , matrix[i][j]);
            
            hash.add(temp);
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            int temp = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
                temp = Math.max(temp , matrix[j][i]);
            
            if(hash.contains(temp))
                ans.add(temp);
        }
            
        System.out.print(ans.toString());
        
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
	    int [][]arr = {
	      {3 , 7 , 8 } , {9 , 11 ,13} , {15 ,16 ,17}
	    };
		new Solution().luckyNumbers(arr);
	}
}