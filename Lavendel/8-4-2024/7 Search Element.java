import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> s1 = new LinkedList<>();
	   
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	        s1.add(sc.nextInt());
	        
	   int key = sc.nextInt();
	   boolean found = false;
	    for(int i=0;i<n;i++)
	        if(key == s1.get(i))
	        {
	            key = i;
	            found = true;
	        }
	   if(found)System.out.print(key);
	   else System.out.print(-1);
	}
}


 