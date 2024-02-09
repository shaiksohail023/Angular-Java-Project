package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "studentName")
	private String studentName;

	@Column(name = "studentRollNo")
	private long studentRollNo;
	
	@Column(name = "studentStatus")
	private String studentStatus;
	
	public Student() {
		
	}
	
	public Student(String studentName, long studentRollNo, String studentStatus) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentStatus = studentStatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}
}
