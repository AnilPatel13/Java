package com.whygo.springjdbc;

import com.whygo.springjdbc.model.Student;
import com.whygo.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student s = context.getBean("student", Student.class);
        s.setRollNo(105);
        s.setName("John");
        s.setMarks(90);

        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.addStudent(s);

        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }

    }

}
