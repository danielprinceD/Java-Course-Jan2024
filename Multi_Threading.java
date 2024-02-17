class Printer
{
    void printDoc(int page, String subject)
    {
        for(int i=1;i<=page;i++)
        System.out.println("Pages printed : "+ i + " for "+subject);
    }
}
class Thread1 extends Thread
{
    Printer p;
    Thread1(Printer p)
    {
        this.p = p;
    }
    @Override
    public void run()
    {
        this.p.printDoc(10, "Java");
    }    
}
class Thread2 extends Thread
{
    Printer p;
    Thread2(Printer p)
    {
        this.p = p;
    }
    @Override
    public void run()
    {
        this.p.printDoc(10, "C++");
    }    
}
public class Multi_Threading {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
        t1.start();
        t2.start();
    }
}
