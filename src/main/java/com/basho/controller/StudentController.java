package com.basho.controller;

import com.basho.entity.Student;
import com.basho.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Student
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    final private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Student> getAll() {
        return studentService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

}
