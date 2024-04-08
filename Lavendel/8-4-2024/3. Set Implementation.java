import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Set<Integer> s1 = new LinkedHashSet<>();
	    Set<Integer> s2 = new LinkedHashSet<>();
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	        s1.add(sc.nextInt());
	    n = sc.nextInt();
	    for(int i=0;i<n;i++)
	        s2.add(sc.nextInt());
	        
	   s1.addAll(s2);
	   System.out.print(s1);
	        
	    
	}
}

