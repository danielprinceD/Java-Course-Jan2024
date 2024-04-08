import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> l1 = new LinkedList<>();
	    List<Integer> l2 = new LinkedList<>();
	   
	    int n = sc.nextInt();
	   for(int i=0;i<n;i++)l1.add(sc.nextInt());
	   
	     n = sc.nextInt();
	   for(int i=0;i<n;i++)l2.add(sc.nextInt());
	   
	   l1.addAll(l2);
	   System.out.print(l1);
	   
	}
}
