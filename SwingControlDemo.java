import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   public SwingControlDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showPasswordFieldDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java Login form");
      mainFrame.setSize(400,800);
      mainFrame.setLayout(new GridLayout(4, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showPasswordFieldDemo(){
      headerLabel.setText("Login Form"); 
      JLabel namelabel= new JLabel("Enter the User ID:", JLabel.LEFT);
      JLabel label = new JLabel("\"<html><br></html>\"");
      label.setText(label.getText());
      JLabel passwordLabel = new JLabel("Enter the Password:", JLabel.LEFT);
      final JTextField userText = new JTextField(6);
      final JPasswordField passwordText = new JPasswordField(6);      
      passwordText.setEchoChar('*');
      JButton loginButton = new JButton("Login");
      loginButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Username " + userText.getText();
            data += ", Password: " + new String(passwordText.getPassword()); 
            statusLabel.setText(data);        
         }
      }); 
      controlPanel.add(namelabel);
      controlPanel.add(userText);
      controlPanel.add(passwordLabel);       
      controlPanel.add(passwordText);
      controlPanel.add(loginButton);
      mainFrame.setVisible(true);  
   }
}