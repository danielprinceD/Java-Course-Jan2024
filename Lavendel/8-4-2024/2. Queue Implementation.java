import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Queue<Integer> ll = new LinkedList<>();
	    ll.add(5);
	    System.out.println("Element Added : " + ll.peek());
	    System.out.println(ll);
	    
	    System.out.println("Element Deleted : " + ll.poll());
	    System.out.println(ll);
	}
}
