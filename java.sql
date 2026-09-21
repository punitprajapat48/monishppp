import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "root";

        try {
            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected");

            // 3. Insert record
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?)"
            );

            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "CSE");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Inserted Successfully");
            }

            // 4. Display records
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("\\nID\\tNAME\\tBRANCH");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\\t" +
                    rs.getString("name") + "\\t" +
                    rs.getString("branch")
                );
            }

            // 5. Close all resources
            rs.close();
            st.close();
            ps.close();
            con.close();

            System.out.println("\\nConnection Closed");

        } catch (Exception e) {
            e.printStackTrace();
        }
