package com.basho.service;

import com.basho.entity.Student;

/**
 * Interface for Student service
 */
public interface StudentService {

    Iterable<Student> getAll();

    Student add(Student s);

    void delete(long id);

    Student getById(long id);

    Student update(Student s);
}
