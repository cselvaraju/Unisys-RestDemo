package com.unisys.RestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisys.RestDemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
