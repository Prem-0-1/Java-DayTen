import java.sql.*;

class JDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/SIBM"; // Database details
        String username = "root"; // MySQL credentials
        String password = "Bunty@123";
        String query = "select * from student"; // Query to be run

        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the query
        ResultSet rs = st.executeQuery(query);

        // Process the results
        while (rs.next()) {
            String name = rs.getString("Stud_Name"); // Retrieve name from db
            System.out.println(name); // Print result on console
        }

        // Close the statement and connection
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}