package com.basho.service;

import com.basho.dao.StudentDao;
import com.basho.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service class for Student
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {


    final private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Iterable<Student> getAll() {
        return studentDao.findAll();
    }

    public Student add(Student s) {
        return studentDao.save(s);
    }
}
