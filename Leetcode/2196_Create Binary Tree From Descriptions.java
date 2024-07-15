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
    
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> children = new HashSet<>();
        HashMap<Integer , TreeNode> nodes = new HashMap();
        
        
        for(int i=0;i<descriptions.length;i++)
        {
            children.add(descriptions[i][1]);
            if(!nodes.containsKey(descriptions[i][0]))
            {
                nodes.put(descriptions[i][0] , new TreeNode(descriptions[i][0]));
            }
            if(!nodes.containsKey(descriptions[i][1]))
            {
                nodes.put(descriptions[i][1] , new TreeNode(descriptions[i][1]) );
            }
            if(descriptions[i][2] == 1)
            {
                nodes.get(descriptions[i][0]).left = nodes.get(descriptions[i][1]);
            }
            else{
                nodes.get(descriptions[i][0]).right = nodes.get(descriptions[i][1]);
            }
        }    
        TreeNode tree = new TreeNode();
        for(Integer n : nodes.keySet())
        {
            if(!children.contains(n))
            {
                tree =  nodes.get(n);
            }
        }
        return tree;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int descriptions[][] = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
	    new Solution().createBinaryTree( descriptions);
	    
	}
}