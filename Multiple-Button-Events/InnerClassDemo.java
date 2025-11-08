import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InnerClassDemo extends JFrame{

       JButton button1, button2;
       JLabel label;

       public InnerClassDemo () {
              setTitle("Inner Class Demo");
              setSize(400,200);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new FlowLayout());

              label = new JLabel("Click a button vro");
              label.setFont(new Font("Arial", Font.BOLD, 16));
              add(label);

              button1 = new JButton("1");
              button2 = new JButton("2");

              add(button1);
              add(button2);

              button1.addActionListener(new Button1Handler());
              
              button2.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e){
                            label.setText("You pressed green");
                     }
              });

              setVisible(true);

       }

       class Button1Handler implements ActionListener{
              public void actionPerformed(ActionEvent e){
                     label.setText("You pressed red");
              }
       }

       public static void main(String[]  args){
              new InnerClassDemo();
       }

}

