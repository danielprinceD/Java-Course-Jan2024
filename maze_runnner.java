import java.util.Scanner;

class maze_runer
{
    static void maze_runner_solver(int cr ,int cc,int fr,int fc,String ans)
    {
        if(cr > fr || cc > fc)return;
        if(cr == fr && cc == fc ) System.out.println(ans);
        maze_runner_solver(cr+1, cc, fr, fc, ans+"H");
        maze_runner_solver(cr, cc+1, fr, fc, ans+"V");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cr,cc,fr,fc;
        cr = s.nextInt();
        cc = s.nextInt();
        fr = s.nextInt();
        fc = s.nextInt();
        maze_runner_solver(cr ,cc ,fr,fc,"");
    }
}