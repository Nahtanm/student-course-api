package com.nscode.student_course_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nscode.student_course_api.entities.Student;
import com.nscode.student_course_api.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	public Student findById(Integer id) {
		return studentRepository.findById(id).get();
	}
	
	public Student inserir(Student student) {
		return studentRepository.save(student);
	}
	
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public Student update(Integer id, Student student) {
		Student entity = studentRepository.getReferenceById(id);
		updateData(entity, student);
		return entity;
	}

	private void updateData(Student entity, Student student) {
		entity.setName(student.getName());
		entity.setEmail(student.getEmail());
		entity.setBirthDate(student.getBirthDate());
	}
	
}
