import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Queue<Character> q = new LinkedList<>();
	   for(int i=0;i<4;i++)
	        q.add(sc.next().charAt(0));
	   while(q.peek() != null)
	   {
	       System.out.print(q.peek() + " ");
	       System.out.print(q.poll() + " ");
	   }
	   System.out.print(q.poll());
	}
}
