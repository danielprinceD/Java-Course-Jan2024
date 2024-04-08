import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Deque<Integer> q = new LinkedList<>();
	   for(int i=0;i<5;i++)
	        q.addFirst(sc.nextInt());
	        
	   q.forEach(n->System.out.print(n + " "));
	}
}
