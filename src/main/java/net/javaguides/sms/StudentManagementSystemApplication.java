package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.Dao.StudentRepository;
import net.javaguides.sms.Entity.Student;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	System.out.println("Application running...");
	}
@Autowired
 private StudentRepository studentrepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.println("CommandLineRunner is active.."); Student student1 =new
		 * Student("Rutuja", "Pardeshi", "rutujasnp@gmail.com");
		 * studentrepository.save(student1);
		 * 
		 * Student student2 =new Student("Shreyas", "Pardeshi", "Shreyas@gmail.com");
		 * studentrepository.save(student2);
		 * 
		 * Student student3 =new Student("Shubhangi", "Kulkarni",
		 * "ShubhangiK@gmail.com"); studentrepository.save(student3);
		 */
	}
 
}
