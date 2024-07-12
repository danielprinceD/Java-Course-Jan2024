import java.util.*;
class Solution {
    static int max_points = 0;
    public static String solver(String s , String pair , int points)
    {
        StringBuilder st = new StringBuilder();
        int res = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==pair.charAt(1) && st.length() > 0 && pair.charAt(0) == st.charAt(st.length()-1))
            {
                st.deleteCharAt(st.length()-1);
                res+=points;
            }
            else{
                st.append(s.charAt(i));
            }
        }
        max_points += res;
        return st.toString();
    }
    public int maximumGain(String s, int x, int y) {
        StringBuilder pair = new StringBuilder();
        int res = 0;
        if(x > y)   pair.append("ab");
        else        pair.append("ba");
        s = solver(s , pair.toString() , Math.max(x , y));
        s = solver(s , pair.reverse().toString() , Math.min(x , y));
        
        return max_points;
    }
}
public class Main
{
	public static void main(String[] args) {
        System.out.println(new Solution().maximumGain("aabbaaxybbaabb" , 5 , 4));
	}
}