import java.util.*;
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> index = new Stack<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') 
                index.push(i);
            if(s.charAt(i) == ')')
            {
                s = reverse(s , index.peek() + 1 , i);
                index.pop();
            }
        }
        return s.replaceAll("\\(" , "").replaceAll("\\)" , "");
    }
    public static String reverse(String s , int start , int end)
    {
        StringBuilder temp = new StringBuilder(s);
        StringBuilder sb = new StringBuilder(s.substring(start , end )).reverse();
        return temp.replace(start, end , sb.toString()).toString();
    }
}
public class Main
{
	public static void main(String[] args) {
	    Solution s = new Solution();
	    System.out.println(s.reverseParentheses("(ed(et(oc))el)"));
	}
}