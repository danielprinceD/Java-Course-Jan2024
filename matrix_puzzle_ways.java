import java.util.*;
public class matrix_puzzle_way
{
    static int ways(int a,int b)
    {
        if(a == 1 && b ==1) return 1;
        if(a<1 || b<1)return 0;
        return ways(a-1,b) + ways(a , b-1);
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int x,y;
		x = s.nextInt();
		y = s.nextInt();
		System.out.print(ways(x,y));
	}
}
