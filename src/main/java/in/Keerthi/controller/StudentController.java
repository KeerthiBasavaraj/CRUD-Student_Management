package in.Keerthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Keerthi.entity.Student;
import in.Keerthi.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/register")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/display")
	public ResponseEntity<?> displayStudents(){
		return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
		
	}
	@PostMapping("/edit/{id}")
	public ResponseEntity<?> editStudent(@RequestBody Student student, @PathVariable Integer id){
		return new ResponseEntity<>(service.editStudent(student, id), HttpStatus.CREATED);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id){
		return new ResponseEntity<>(service.deleteStudent(id), HttpStatus.OK);
		
	}
	
}
