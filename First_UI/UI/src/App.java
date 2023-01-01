import java.awt.*;
public class App {
    App()
    {
        Frame f = new Frame();
        Label l = new Label("Hello World                                   ");
        f.setTitle("UI Application");
        f.add(l);
        Button b = new Button("Hello");
        b.setBounds(20,40,20,40);
        b.setSize(200,200);
        b.setVisible(true);
        f.add(b);
        f.setSize(200,200);
        f.setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        App ap = new App();
        ap.clone();
    }
}
