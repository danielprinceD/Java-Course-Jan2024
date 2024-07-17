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
    
    public static TreeNode dfs(TreeNode node, Set<TreeNode> hashlist , Set<Integer> delete)
    {
        if(node==null) {
            return null;
        }
        
        TreeNode res = node;
        
        if(delete.contains(node.val))
        {
            res = null;
            hashlist.remove(node);
            if(node.left!=null) hashlist.add(node.left);
            if(node.right!=null) hashlist.add(node.right);
        }
        node.left = dfs(node.left , hashlist , delete);
        node.right = dfs(node.right , hashlist , delete);
        return res;
    }
    
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> del = new HashSet();
        for(int a : to_delete)del.add(a);
        Set<TreeNode> hashlist = new HashSet();
        hashlist.add(root);
        
        dfs(root , hashlist , del);
        
        
        List<TreeNode> list = new ArrayList<>(hashlist);
        
        return list;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Solution s = new Solution();
	    TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
	    s.delNodes(root , new int[]{ 1  ,3});
	}
}