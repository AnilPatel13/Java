package JDBC;
import java.sql.*;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        import package
        load and register
        create connection
        create statement
        execute query
        process result
        close connection

        */

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "LocalPostgres123!");

        System.out.println("Connection established");

        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM student";

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next())
        {
            System.out.println(rs.getInt("sid") + " " + rs.getString("sname") + " " + rs.getString("marks"));
        }

        conn.close();





    }
}
