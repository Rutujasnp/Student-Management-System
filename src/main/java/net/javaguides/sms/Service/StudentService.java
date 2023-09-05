package net.javaguides.sms.Service;

import java.util.List;

import net.javaguides.sms.Entity.Student;

public interface StudentService {
	
	
	List<Student> getAllstudents();
	
	Student saveStudent(Student student);
	Student getStudentById(int id);
	Student editStudent(Student student);
	void deleteStudentById(int id);
	
	
}
