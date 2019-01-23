package org.maven.service;

import org.maven.beans.CourseDomain;

public interface CourseService {
		
	int getById(Integer  courseId);
	
	int  insert(CourseDomain courseDomain);
	
	int update(Integer  courseId);
	
	int  delete(Integer  courseId);
}
