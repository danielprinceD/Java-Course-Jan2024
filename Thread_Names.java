class Mythread implements Runnable
{
    int i;String name;
    Mythread(int i,String name)
    {
        this.i = i;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Thread Name :  "+name + " Number : " + (i+10) + " is running...");
    }
}
public class Main
{
    public static void main (String[] args) {
        String str[] = {"Dog","Cat","Mon","Hip","Bir"};
        Thread th[] = new Thread[10];
        for(int i=0;i<5;i++)
        {
            Runnable r = new Mythread(i,str[i]);
            th[i] = new Thread(r);
            th[i].start();
        }
    }
}