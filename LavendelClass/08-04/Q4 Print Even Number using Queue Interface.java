import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Queue<Integer> q = new LinkedList<>();
	   for(int i=1;i<=10;i++)
	    q.add(i);
	   q.forEach(n->{
	       if(n%2 == 0)System.out.print(n + " ");
	   });
	}
}
