import java.awt.*;
public class App {
    App()
    {
        Frame f = new Frame();
        Label l = new Label("Hello World                                   ");
        f.setTitle("UI Application");
        f.add(l);
        f.setSize(200,200);
        f.setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        App ap = new App();
        ap.clone();
    }
}
