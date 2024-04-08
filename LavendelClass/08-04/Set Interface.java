import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	Set st = new HashSet();
	st.add(10.5f);
	st.add(100.6);
	st.add("da");
	st.add(1);
	st.add("daniel");
	st.forEach(n->System.out.print(n + " "));
	
  }
}
