package Collections;
import java.util.*;
public class Array_list_1
{
  public static void swap(ArrayList al , int i ,int j)
  {
      String str = al.get(i).toString();
      al.set(i, al.get(j));
      al.set(j, str);  
  }
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    ArrayList list = new ArrayList();
    while(n-->0)list.add(s.next());
    ArrayList a = new ArrayList();
    int min_i;
    for(int i=0;i<list.size();i++)
      {
        for(int j=i+1;j<list.size();j++)
        {
           if(list.get(i).toString().length() > list.get(j).toString().length())
           {
             swap(list , i , j);
           }
        }
      }
    System.out.println(list);
  }
}