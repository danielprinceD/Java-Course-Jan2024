import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   Queue<Integer> q = new LinkedList<>();
	   for(int i=0;i<n;i++)
	   {
	       int number = sc.nextInt();
	       q.add(number);
	   }
	   Object[] arr = q.toArray();
	   for(int i=0;i<q.size();i++)
	    System.out.print(arr[i] + " ");
	}
}
