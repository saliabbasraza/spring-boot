package com.basho.dao;

import com.basho.entity.Student;

/**
 * Interface for Student Dao
 */
public interface StudentDao {

    Iterable<Student> findAll();

    Student save(Student s);
}

