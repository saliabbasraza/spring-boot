package com.basho.dao;

import com.basho.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * DAO for Student
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    final private StudentDaoCrud studentDaoCrud;

    @Autowired
    public StudentDaoImpl(StudentDaoCrud studentDaoCrud) {
        this.studentDaoCrud = studentDaoCrud;
    }

    @Override
    public Iterable<Student> findAll() {
        return studentDaoCrud.findAll();
    }

    @Override
    public Student save(Student s) {
        return studentDaoCrud.save(s);
    }

    @Override
    public void delete(long id) {
        studentDaoCrud.delete(id);
    }

    @Override
    public Student findById(long id) {
        return studentDaoCrud.findOne(id);
    }
}
