package com.nscode.student_course_api.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nscode.student_course_api.entities.Student;
import com.nscode.student_course_api.services.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		return ResponseEntity.ok().body(studentService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Student> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(studentService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Student> inserir(@RequestBody Student student){
	    studentService.inserir(student);
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getId()).toUri();
		return ResponseEntity.created(uri).body(student);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		studentService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student student){
		return ResponseEntity.ok().body(studentService.update(id, student));
	}
	
}
