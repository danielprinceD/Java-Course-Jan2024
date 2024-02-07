class maze_runer
{
    static void horizontal(int i,int j)
    {
        if(j < 2)
        {
            System.out.print("H");
            horizontal(i, j+1);
        }
        else if(i < 2)
        {
            System.out.print("V");
            vertical(i+1, j);

        }
        else
        return;
        }
    static void vertical(int i,int j)
    {
        if(i < 2){
            System.out.print("V");
            vertical(i+1, j);
        }
        else if(j < 2)
        {
            System.out.print("H");
            horizontal(i, j+1);
        }
        else return;
    }
    static void maze(int i,int j, int time)
    {
        if(i <= 2 && j < 2)
        {
            horizontal(i,j+1);
            System.out.print("H");
            System.out.println();
            vertical(i+1,j);
            System.out.print("V");
        }
        
    }
    public static void main(String[] args) {
        maze(0,0 , 2);
    }
}