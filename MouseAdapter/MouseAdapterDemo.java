import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterDemo extends JFrame {

       JLabel label;

       public MouseAdapterDemo(){
              setTitle("Mouse Adapter Demo");
              setSize(400,300);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new FlowLayout());


              label = new JLabel("Click Somewhere");
              label.setFont(new Font("Airal", Font.PLAIN, 16));
              add(label);

              addMouseListener(new MouseAdapter(){
                     public void mouseClicked(MouseEvent e){
                            label.setText("Mouse Clicked in window" + e.getX() +"," + e.getY());
                     }
              });

              setVisible(true);

       }


       public static void main(String[] args){
              new MouseAdapterDemo();
       }

}