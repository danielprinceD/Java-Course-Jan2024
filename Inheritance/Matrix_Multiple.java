package Inheritance;

import java.util.Scanner;

class Matrix
{
    static int row,col;
    static int arr[][];
    Matrix(int r , int c)
    {
        Scanner s = new Scanner(System.in);
        row = r;
        col = c;
        this.arr = new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j] = s.nextInt();
    }

}
class Clock
{
    
}
class Anticlockwise
{

}

public class Matrix_Multiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        Matrix m = new Matrix(row, col);
    }
}
