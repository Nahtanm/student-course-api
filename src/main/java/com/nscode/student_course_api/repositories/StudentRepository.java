package com.nscode.student_course_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nscode.student_course_api.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
