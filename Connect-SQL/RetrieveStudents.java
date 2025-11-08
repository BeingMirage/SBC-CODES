import java.sql.*;

public class RetrieveStudents {

    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
             
            // Connect to Database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "mysql");

            // Execute Query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student Records:");
            System.out.println("----------------------------");

            // Display Records
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "  " +
                    rs.getString("name") + "  " +
                    rs.getString("course") + "  " +
                    rs.getInt("marks"));
            }

            // Close Connections
            rs.close();
            stmt.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
