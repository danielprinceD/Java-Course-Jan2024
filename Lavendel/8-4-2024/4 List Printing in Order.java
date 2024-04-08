import java.util.*;

class Compare implements Comparator<Integer>
{
    @Override
    public int compare(Integer a , Integer b){
        return b - a;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> l1 = new ArrayList<>();
	    int n = sc.nextInt();
	   
	    for(int i=0;i<n;i++)
	        l1.add(sc.nextInt());
	   Collections.sort(l1);
	   System.out.println(l1);
	   
	   Collections.sort(l1 , new Compare());
	   
	   System.out.print(l1);
	   
	    
	}
}

 