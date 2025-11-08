import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.*;


public class StudentDBApp extends JFrame implements ActionListener{
       JTextField id, name, course, marks;
       JButton insert, update, delete;
       Connection con;

       public StudentDBApp(){
              setTitle("Student Database App");
              setSize(600,400);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setLayout(new GridLayout(5,2,5,5));


              add(new JLabel("ID:")); id = new JTextField(); add(id);
              add(new JLabel("Name:")); name = new JTextField(); add(name);
              add(new JLabel("Course:")); course = new JTextField(); add(course);
              add(new JLabel("Marks:")); marks = new JTextField(); add(marks);   
              
              
              insert = new JButton("Insert");
              update =  new JButton("Update");
              delete = new JButton("Delete");
              add(insert); add(delete); add(update);

              
              insert.addActionListener(this);
              update.addActionListener(this);
              delete.addActionListener(this);


              try {

                     Class.forName("com.mysql.cj.jdbc.Driver");
                     con = DriveManager.getConnection(
                            "jdbc:mysql://localhost:3306/college", "root", "mysql"
                     );

              } catch (Exception e) {
                     JOptionPane.showMessageDialog(this,"DB Error"+ e);
              }


              setVisible(true);


       }


       public static void main(String[] args) {
           new StudentDBApp();
       }
       
}
