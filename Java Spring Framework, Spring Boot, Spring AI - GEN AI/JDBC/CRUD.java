package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "LocalPostgres123!");

        Statement st = conn.createStatement();

//        String sql = "insert into student values(11, 'John', 80)";

//        String sql = "update student set marks = 90 where sid = 11";

        String sql = "delete from student where sid = 11";

        int rows = st.executeUpdate(sql);

        System.out.println(rows + " rows inserted");

    }
}
