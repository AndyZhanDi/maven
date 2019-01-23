package org.maven.beans;

import java.util.List;

public class StudentDomain {
	private int studentId;
	private String studentName;
	private String studentAge;
	private String studentSex;
	private int classId;
	
	private Integer password;
	private List<RoleDomain> roles;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public List<RoleDomain> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDomain> roles) {
		this.roles = roles;
	}

	
}
