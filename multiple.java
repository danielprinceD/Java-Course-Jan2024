class Mythread implements Runnable
{
    int i;
    public void run()
    {
        int i = (int)Thread.currentThread().getId();
        System.out.println("Running Thread : " + (i + 2));
    }
    
}
public class multiple {
    public static void main(String[] args) {
        Thread th[]= new Thread[5];
        Runnable a = new Mythread();
        for(int i=0;i<5;i++)
        {
            th[i] = new Thread(a);
            th[i].start();
        }
    }
}
