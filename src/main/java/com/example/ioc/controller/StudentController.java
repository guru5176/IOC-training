package com.example.ioc.controller;

import com.example.ioc.model.Student;
import com.example.ioc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/students/{rno}")
	public Student getStudentByRollNo(@PathVariable("rno") int rollNo) {
		return studentService.getStudentByRollNo(rollNo);
	}

	@PostMapping("/students")
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "Student added";
	}

	@PutMapping("/students")
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping("/students/{rno}")
	public String deleteStudent(@PathVariable("rno") int rollNo) {
		return studentService.deleteStudentByRollNo(rollNo);
	}
}
