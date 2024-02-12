import java.util.Scanner;

public class game {
    static void show_grid(char arr[][],int num)
    {
        for(int i=0;i<num;i++)
         {
             for(int j=0;j<num;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
         }  
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        char[][]arr = new char[num][num];
        for(int i=0;i<num;i++)
            for(int j=0;j<num;j++)
                arr[i][j] = '*';
        arr[0][0] = '|';
        show_grid(arr,num);
         int pos,cr=0,cc=0;
         while(true)
         {

            System.out.println("Enter the positon to move : ");
            System.out.println("1.Up");
            System.out.println("2.Down");
            System.out.println("3.Left");
            System.out.println("4.Right");
            pos = s.nextInt();
            switch(pos)
            {
                case 1 : 
                    arr[cr][cc] = '*';
                    move(arr,--cr, cc,num);
                    break;
                case 2:
                    arr[cr][cc] = '*';
                    move(arr,++cr,cc,num);
                    break;
                case 3:
                    arr[cr][cc] = '*';
                    move(arr,cr,--cc,num);
                    break;
                case 4:
                    arr[cr][cc] = '*';
                    move(arr,cr,++cc,num);
                    break;
                default:
                    System.out.println("Enter Posibble Position to move");
                 
            }
            
         }
 
        }
        static void move(char[][]arr , int cr , int cc, int num)
        {
           if(cr < 0 || cc < 0 || cr >= num || cc >= num )
           {
            System.out.println("Game Over");
            return;
        }
           arr[cr][cc] = '|';
            show_grid(arr, num);
        }
}
