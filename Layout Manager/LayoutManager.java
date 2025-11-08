import java.awt.*;
import javax.swing.*;

public class LayoutManager extends JFrame {


       public LayoutManager(){
              setTitle("Layout Manager");
              setSize(640, 280);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new BorderLayout());


              //Panel 1
              JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
              flowPanel.add(new JButton("1"));
              flowPanel.add(new JButton("2"));
              flowPanel.add(new JButton("3"));
              flowPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

              //Panel2
              JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
              for (int i = 1; i <= 6; i++){
                     gridPanel.add(new JButton("B"+i));
              }

              //Panel3
              JPanel borderPanel = new JPanel(new BorderLayout(5, 5));
              borderPanel.add(new JButton("North"), BorderLayout.NORTH);
              borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
              borderPanel.add(new JButton("East"), BorderLayout.EAST);
              borderPanel.add(new JButton("West"), BorderLayout.WEST);
              borderPanel.add(new JButton("Center"), BorderLayout.CENTER);


              // Add everything to main frame using tabs
              JTabbedPane tabs = new JTabbedPane();
              tabs.addTab("FlowLayout", flowPanel);
              tabs.addTab("GridLayout", gridPanel);
              tabs.addTab("BorderLayout", borderPanel);


              add(tabs);

              setVisible(true);
       }


       public static void main(String[] args) {
           new LayoutManager();
       }

       
}
