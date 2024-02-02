import java.util.Scanner;
public class MAX_ele_row {    
  public static void main(String[] args) {      
    int c,r,max;       
    Scanner s = new Scanner(System.in); 
    r = s.nextInt();       
    c = s.nextInt();       
    int[][] arr = new int[r][c];   
    for(int i=0;i<r;i++)      
      {         
        for(int j=0;j<c;j++)     
          {             
            arr[i][j] = s.nextInt();    
        }   
      }      

      for(int i =0;i<c;i++)
      {
        max =0;
        for(int j=0;j<r;j++)
        {
            max = Math.max(max,arr[j][i]);
        }
        System.out.println(max);
        if(i!=arr.length-1)
        {
            System.out.println();
        }
      }
  }
}
