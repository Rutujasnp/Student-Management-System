package net.javaguides.sms.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.Dao.StudentRepository;
import net.javaguides.sms.Entity.Student;
import net.javaguides.sms.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}

	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
