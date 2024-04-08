import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Queue<Integer> q = new PriorityQueue<>();
	   int size = sc.nextInt();
	   for(int i=0;i<size;i++)
	    q.add(sc.nextInt());
	    
	   while(q.peek()!=null)
	       System.out.print(q.poll() + " ");
	}
}
