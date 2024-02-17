import java.util.Scanner;class Pairs{ 
    int num,pair_num; 
    int arr[];
    Pairs(int num) 
    {    
      this.num = num;
      this.arr = new int[num];
     }  
    void pairs()   
    {    
      Scanner s = new Scanner(System.in); 
         
      for(int i=0;i<this.num;i++)          
        this.arr[i] = s.nextInt();    
      this.pair_num = s.nextInt();    
     
    }    
    void print() 
    {   
      for(int i=0;i<this.num;i++)        {      
        {      
          for(int j=0;j<this.num;j++)
           if(this.arr[i] + this.arr[j] == this.pair_num)       
            System.out.println(this.arr[i] + " " +this.arr[j]);       
        }    
      }  
    }
  }
  public class All_Pairs {  
    public static void main(String[] args) {   
      Scanner s = new Scanner(System.in);   
      int num = s.nextInt();  
      Pairs p = new Pairs(num);
      p.pairs();
      p.print();
    }}