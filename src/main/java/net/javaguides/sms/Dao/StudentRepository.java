package net.javaguides.sms.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
