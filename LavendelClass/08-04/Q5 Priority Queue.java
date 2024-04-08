import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Queue<Integer> q = new PriorityQueue<>();
	   q.add(30);
	   q.add(20);
	   q.add(10);
	   while(q.peek()!=null)
	       System.out.print(q.poll() + " ");
	}
}
