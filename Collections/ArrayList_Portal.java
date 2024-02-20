import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    ArrayList name = new ArrayList();
    while(n-- >=0)
      name.add(s.nextLine());
    Iterator it = name.iterator();
    while(it.hasNext())
      System.out.println(it.next());
  }
}