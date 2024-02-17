import java.util.Scanner;class Pairs{ 
    int num,pair_num; 
    int arr[];
    Pairs(int num)
    {    
      this.num = num;
      this.arr = new int[num];
     }  
  }
  public class All_Pairs {  
    public static void main(String[] args) {   
      Scanner s = new Scanner(System.in);   
      int num = s.nextInt();  
      Pairs p = new Pairs(num);
      for(int i=0;i<p.num;i++)          
        p.arr[i] = s.nextInt();    
      p.pair_num = s.nextInt();
      for(int i=0;i<p.num;i++)        {      
        {      
          for(int j=0;j<p.num;j++)
           if(p.arr[i] + p.arr[j] == p.pair_num)       
            System.out.println(Integer.toString(p.arr[i])  + " " +Integer.toString(p.arr[j]));       
        }    
      } 
    }}