import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginWindow extends JFrame {
       JTextField username;
       JPasswordField password;
       JButton loginButton;

       public LoginWindow(){
              setTitle("Login Window");
              setSize(640, 480);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new BorderLayout());

              JPanel LoginPanel = new JPanel(new GridLayout(3,2,5,5));

              LoginPanel.add(new JLabel("Username"));
              username = new JTextField();
              LoginPanel.add(username);

              LoginPanel.add(new JLabel("Password"));
              password = new JPasswordField();
              LoginPanel.add(password);

              loginButton = new JButton("Login");
              LoginPanel.add(loginButton);


              add(LoginPanel , BorderLayout.CENTER);


              setVisible(true);

              loginButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                            String user = username.getText();
                            String pass = new String(password.getPassword());

                            if(user.equals("admin") && pass.equals("1234")){
                                   JOptionPane.showMessageDialog(null, "Login Success");
                            }
                            else{
                                   JOptionPane.showMessageDialog(null, "Invalid Login");
                            }
                     }
              });


       }

       public static void main(String[] args) {
           new LoginWindow();
       }
       
}
