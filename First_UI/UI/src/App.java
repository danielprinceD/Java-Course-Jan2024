import java.awt.*;
import java.util.Scanner;
public class App {
    App()
    {
        Frame f = new Frame("Java Desktop GUI");
        Label l = new Label("Hello World                                   ");
        f.setTitle("UI Application");
        f.add(l);
        f.setSize(200,200);
        f.setVisible(true);
        TextField tx = new TextField("Have a meal ? : ");
        tx.setVisible(true);
        f.add(tx);
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num > -1)
            f.dispose();

    }
    public static void main(String[] args) throws Exception {
        App ap = new App();
        ap.clone();
    }
}
