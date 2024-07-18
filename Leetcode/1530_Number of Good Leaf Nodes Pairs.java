import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private static int count = 0 ;
    private static ArrayList<Integer> dfs(TreeNode root ,int distance)
    {
        ArrayList<Integer> combine = new ArrayList();
        if(root  == null)return combine;
        
        if(root.left == null && root.right == null){
            combine.add(1);
            return combine;
        }
        
        ArrayList<Integer> left_side = dfs(root.left , distance);
        ArrayList<Integer> right_side = dfs(root.right , distance);
        
        
        for(int i : left_side)
            for(int j : right_side)
                if( (i+j) <= distance)
                    count+=1;
        
        combine.addAll(left_side);
        combine.addAll(right_side);
        
        for(int i=0;i<combine.size();i++)
            combine.set(i , 1+combine.get(i));
        
        return combine;
    }
    public int countPairs(TreeNode root, int distance) {
        count = 0;
        dfs(root , distance);
        return count;
    }
}
public class Main
{
	public static void main(String[] args) {
	    TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	    root.right = new TreeNode(3);
	    root.left.left = new TreeNode(4);
	    root.left.right = new TreeNode(5);
	    root.right.left = new TreeNode(6);
	    root.right.right = new TreeNode(7);
	    new Solution().countPairs(root , 3);
	}
}