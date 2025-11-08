import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class newReg extends JFrame{
       JTextField nameField, emailField;
       JRadioButton male, female;
       JComboBox<String> cityBox;
       JButton submit;

       public newReg(){
              setTitle("Registration form");
              setSize(450, 360);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new BorderLayout());

              JPanel panel = new JPanel(new GridLayout(5,2,5,5));

              panel.add(new JLabel("Name :"));
              nameField = new JTextField();
              panel.add(nameField);

              panel.add(new JLabel("Email :"));
              emailField = new JTextField();
              panel.add(emailField);

              panel.add(new JLabel("Gender :"));
              male = new JRadioButton("male");
              female = new JRadioButton("female");
              ButtonGroup genderGroup = new ButtonGroup();
              genderGroup.add(male);
              genderGroup.add(female);

              JPanel genderPanel = new JPanel();
              genderPanel.add(male);
              genderPanel.add(female);
              panel.add(genderPanel);

              panel.add(new JLabel("City:"));
              String[] cities = {"Pune" , "Mumbai" , "China"};
              cityBox = new JComboBox<>(cities);
              panel.add(cityBox);

              submit = new JButton("Submit");
              panel.add(new JLabel());
              panel.add(submit);



              add(panel , BorderLayout.CENTER);

              submit.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                            String name = nameField.getText();
                     }
              });


              setVisible(true);

              
       }

       public static void main(String[] args) {
           new newReg();
       }
}


