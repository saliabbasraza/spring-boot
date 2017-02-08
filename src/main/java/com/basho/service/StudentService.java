package com.basho.service;

import com.basho.dao.StudentDao;
import com.basho.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for Student
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List getAll() {
        return studentDao.getAll();
    }

    public Student add(Student s) {
        return studentDao.add(s);
    }
}
