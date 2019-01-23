package org.maven.beans;

public class TeacherDomain {
	private int teacherId;
	private String teacherName;
	private int teacherSalary;
	private int courseId;
	private int classId;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(int teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
}
