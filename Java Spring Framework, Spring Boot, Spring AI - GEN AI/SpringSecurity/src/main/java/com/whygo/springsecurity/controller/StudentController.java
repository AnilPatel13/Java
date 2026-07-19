package com.whygo.springsecurity.controller;

import com.whygo.springsecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1, "John", "Spring"),
                    new Student(2, "Jane", "Spring Boot"),
                    new Student(3, "Jack", "Spring Security"),
                    new Student(4, "Jill", "Spring Cloud"),
                    new Student(5, "XXXX", "Spring Cloud"),
                    new Student(6, "YYYY", "Spring Cloud")

            )
    );

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }


}
