import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    ArrayList list = new ArrayList();
    for(int i=0;i<size;i++)
      {
        list.add(s.next());
      }
    int frequency = 0;
    String str = s.next();
    for(int i=0;i<size;i++)if(list.get(i).equals(str))frequency++;
    System.out.println(frequency);
  }
}