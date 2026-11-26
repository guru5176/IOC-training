package com.example.ioc.service;

import com.example.ioc.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

	private final List<Student> students = new ArrayList<>(
			Arrays.asList(
					new Student(1, "Arun", "Java"),
					new Student(2, "Kiran", "Spring Boot")
			)
	);

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudentByRollNo(int rollNo) {
		for (Student student : students) {
			if (student.getRno() == rollNo) {
				return student;
			}
		}
		return null;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public String updateStudent(Student updatedStudent) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getRno() == updatedStudent.getRno()) {
				students.set(i, updatedStudent);
				return "Updated successfully";
			}
		}
		return "Student not found";
	}

	public String deleteStudentByRollNo(int rollNo) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getRno() == rollNo) {
				students.remove(i);
				return "Deleted successfully";
			}
		}
		return "Student not found";
	}
}
