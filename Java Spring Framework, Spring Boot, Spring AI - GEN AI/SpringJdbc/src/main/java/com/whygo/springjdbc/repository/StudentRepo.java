package com.whygo.springjdbc.repository;

import com.whygo.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbcTemplate() {
        return jdbc;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "INSERT INTO student (rollNo, name, marks) VALUES (?, ?, ?)";
        int rowsAffected = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rowsAffected + " row(s) affected");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";

        return jdbc.query(sql, (rs,  rowNum) -> {

            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;

        });
    }
}
