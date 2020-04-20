package com.example.api;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping(value="/student/{id}", method= RequestMethod.POST)
    public String updateUser(@PathVariable("id") int userId) {

        Student student = studentService.selectOne(2);
        student.setName("new name");
        student.setAge(40);
        studentService.addOne(student);
        return "OK";
    }
}
