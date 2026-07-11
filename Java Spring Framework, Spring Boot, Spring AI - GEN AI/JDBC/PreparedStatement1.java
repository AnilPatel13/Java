package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class PreparedStatement1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "LocalPostgres123!");

        int sid = 11;
        String sname = "John";
        int marks = 80;

        String sql = "insert into student values(?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, sid);
        stmt.setString(2, sname);
        stmt.setInt(3, marks);

        int rows = stmt.executeUpdate();

        System.out.println(rows + " rows inserted");





    }
}
