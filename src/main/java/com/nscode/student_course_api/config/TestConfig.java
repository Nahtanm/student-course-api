package com.nscode.student_course_api.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nscode.student_course_api.entities.Course;
import com.nscode.student_course_api.entities.Student;
import com.nscode.student_course_api.entities.enums.CourseLevel;
import com.nscode.student_course_api.repositories.CourseRepository;
import com.nscode.student_course_api.repositories.StudentRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(null, "Matemática", 60, CourseLevel.BEGINNER);
		Course c2 = new Course(null, "Programação Java", 80, CourseLevel.INTERMEDIATE);
		Course c3 = new Course(null, "Banco de Dados", 70, CourseLevel.ADVANCED);

		Student s1 = new Student(null, "Alice Silva", "alice@gmail.com", LocalDate.parse("2004-07-20"));
		Student s2 = new Student(null, "Bruno Costa", "bruno@gmail.com", LocalDate.parse("2002-01-15"));

		courseRepository.saveAll(Arrays.asList(c1, c2, c3));
		studentRepository.saveAll(Arrays.asList(s1, s2));
	}

}
