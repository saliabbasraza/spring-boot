package com.basho.controller;

import com.basho.entity.Student;
import com.basho.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Student
 */
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    final private StudentService studentService;

    @GetMapping()
    public Iterable<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping()
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @PutMapping(path = {"/{id}"})
    public Student update(@PathVariable long id, @RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable long id) {
        return studentService.getById(id);
    }
}
