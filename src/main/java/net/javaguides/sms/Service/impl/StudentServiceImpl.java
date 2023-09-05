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
		return studentRepository.findAll();// findAll is method from JPARepository
	}

	@Override
	public Student saveStudent(Student student) {
	return studentRepository.save(student);// save()is method from crudRepository.
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();// findById method returns object of optional class,taking Student as argument
	}

	@Override
	public Student editStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(id);
	}

}
