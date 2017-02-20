package com.basho.dao;

import com.basho.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring boot CRUD for Student
 */
@Repository
public interface StudentDaoCrud extends CrudRepository<Student, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    Student findByName(String name);
}
