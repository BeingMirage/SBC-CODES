import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseKeyDemo extends JFrame implements MouseListener, KeyListener{

       JLabel label;

       public MouseKeyDemo(){
              setTitle("Mouse and Keyboard Event");
              setSize(400,300);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new FlowLayout());

              label = new JLabel("Perform Mouse or Keyboard Actions");
              label.setFont(new Font("Airal", Font.PLAIN, 16));
              add(label);

              addMouseListener(this);
              addKeyListener(this);

              setVisible(true);
              setFocusable(true);


       }


       // ---- MouseListener methods ----
       public void mouseClicked(MouseEvent e) {
              label.setText("Mouse Clicked");
       }
       public void mousePressed(MouseEvent e) {}
       public void mouseReleased(MouseEvent e) {}
       public void mouseEntered(MouseEvent e) {}
       public void mouseExited(MouseEvent e) {}

       // ---- KeyListener methods ----
       public void keyTyped(KeyEvent e) {
              label.setText("Key Typed: " + e.getKeyChar());
       }
       public void keyPressed(KeyEvent e) {}
       public void keyReleased(KeyEvent e) {}


       public static void main(String[] args) {
              new MouseKeyDemo();
       }


}
