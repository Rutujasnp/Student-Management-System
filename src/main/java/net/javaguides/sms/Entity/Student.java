package net.javaguides.sms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String gmail_id;
	public Student() {
		super();
	}
	
	

	public Student(int id, String first_name, String last_name, String gmail_id) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gmail_id = gmail_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGmail_id() {
		return gmail_id;
	}

	public void setGmail_id(String gmail_id) {
		this.gmail_id = gmail_id;
	}


}
