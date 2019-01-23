package org.maven.service;

import java.util.List;

import org.maven.beans.TeacherDomain;



public interface TeacherService {
	
	TeacherDomain  getById(Integer  teacherId);
	
	List<TeacherDomain>  getByName(String  teacherName);
	
	int insert(TeacherDomain  teacherDomain);
	
	int update(Integer  teacherId);
	
	int  delete(Integer  teacherId);
	
	List<TeacherDomain>  selectTeachersOfClassId(Integer  classId);
}
