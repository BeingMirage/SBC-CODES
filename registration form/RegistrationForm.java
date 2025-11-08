import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {
    JTextField nameField, emailField;
    JRadioButton male, female;
    JComboBox<String> cityBox;
    JButton submit;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

        // Name
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Email
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        // Gender
        panel.add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        panel.add(genderPanel);

        // City
        panel.add(new JLabel("City:"));
        String[] cities = {"Select", "Pune", "Mumbai", "Delhi", "Bangalore"};
        cityBox = new JComboBox<>(cities);
        panel.add(cityBox);

        // Submit
        submit = new JButton("Submit");
        panel.add(new JLabel()); // Empty cell
        panel.add(submit);

        add(panel, BorderLayout.CENTER);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not selected");
                String city = (String) cityBox.getSelectedItem();

                JOptionPane.showMessageDialog(null,
                        "Name: " + name + "\nEmail: " + email + "\nGender: " + gender + "\nCity: " + city);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
