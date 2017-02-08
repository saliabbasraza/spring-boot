package com.basho.dao;

import com.basho.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * DAO for Student
 */
@Repository
public class StudentDao {

    static List<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student(1, "Ali"));
        students.add(new Student(2, "Hasan"));
        students.add(new Student(3, "Zehra"));
    }

    public List getAll() {
        return students;
    }

    public Student add(Student student) {
        student.setId(students.size() + 1);
        students.add(student);
        return student;
    }
}
