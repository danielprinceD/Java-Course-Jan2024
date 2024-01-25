import java.util.Scanner;
public class Main
  {

    public static int[][] createArray(int a,int b)
    {
      int arr[][] = new int[a][b];
      Scanner s = new Scanner(System.in);
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              arr[i][j] = s.nextInt();
            }
        }
      return arr;
    }
    public static int getElement(int[][] arr,int a_size,int b_size)
    {
      int[][] arr1 = createArray(a_size,b_size);
      int[][] arr2 =  createArray(a_size,b_size); 
      int[][] mat3 = new int[a_size][b_size];
       addMatrix(arr1,arr2,mat3,a_size,b_size);
      return 0;
    }
    public static int addMatrix(int[][] arr1,int[][] arr2 ,int[][] mat3, int a_size ,int b_size) 
    {
      for(int i=0;i<a_size;i++)
        {
          for(int j=0;j<b_size;j++)
            {
              mat3[i][j] = arr1[i][j]  + arr2[i][j];
              System.out.print(mat3[i][j]+" ");
            }
        }
      
      return 0;
    }
    public static void main(String[] args)
    {
      int a_size,b_size;
      Scanner s = new Scanner(System.in);
      a_size = s.nextInt();
      b_size = s.nextInt();
      int[][] arr = new int[a_size][b_size];
      
      getElement(arr,a_size,b_size);
    }
  }