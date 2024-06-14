import javax.swing.*;
import java.awt.*;
public class Swingeg extends JFrame{
    public static void main(String[] args) throws Exception{
        Frame f = new Frame();
            f.setTitle("Swing Test Program");
     
            Label l1 = new Label("Login Form");
     
            l1.setBounds(100, 50, 120, 80);
            f.add(l1);
     
            // Checkbox c2 = new Checkbox("Hindi");
            // c2.setBounds(100, 150, 50, 50);
            // f.add(c2);
            // Checkbox c3 = new Checkbox("English");
            // c3.setBounds(100, 200, 80, 50);
            // f.add(c3);
            // Checkbox c4 = new Checkbox("marathi");
            // c4.setBounds(100, 250, 80, 50);
            // f.add(c4);
            
            f.setSize(500, 900);
            f.setLayout(null);
            f.setVisible(true);        
    }
}