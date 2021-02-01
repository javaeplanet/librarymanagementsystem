package com.javaeplanet.library.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaeplanet.library.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
