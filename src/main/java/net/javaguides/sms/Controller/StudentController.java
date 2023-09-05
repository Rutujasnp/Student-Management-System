package net.javaguides.sms.Controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.sms.Entity.Student;
import net.javaguides.sms.Service.StudentService;

@Controller
public class StudentController {
private StudentService studentService;

public StudentController(StudentService studentService) {
	super();
	this.studentService = studentService;
}
@GetMapping("/students")
public String listStudents(Model model) {
	model.addAttribute("students",studentService.getAllstudents());
	return "students";
	
}
@GetMapping("/students/new")
public String createStudentForm(Model model) {
	//create student obj to hold student form data
	Student student =new Student();
	model.addAttribute("student", student);
	return "create_student";
}

@PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student) {
	 studentService.saveStudent(student);
	return "redirect:/students";
	
}

@GetMapping("students/edit/{id}")
public String editStudentForm(@PathVariable int id, Model model) {
	Student student =new Student();
	model.addAttribute("student", studentService.getStudentById(id));
	return "edit_student";
}
@PostMapping("/students/{id}")
public String editStudent(@PathVariable int id,
		@ModelAttribute("student") Student student , Model model) {
	
	//get existing student from database by id
	Student existingStudent= studentService.getStudentById(id);
	existingStudent.setId(id);
	existingStudent.setFirst_name(student.getFirst_name());
	existingStudent.setLast_name(student.getLast_name());
	existingStudent.setGmail_id(student.getGmail_id());
	
	//save updated student info
	studentService.editStudent(existingStudent);
	return "redirect:/students";
}
@GetMapping("students/delete/{id}")
public String deleteStudentForm(@PathVariable int id,  Model model) {
	studentService.deleteStudentById(id);
	return "redirect:/students";
	
}

	

	
	
}


