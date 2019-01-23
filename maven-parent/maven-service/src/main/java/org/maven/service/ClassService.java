package org.maven.service;

import org.maven.beans.ClassDomain;

public interface ClassService {
	ClassDomain getById(Integer classId);
	
	int insert(ClassDomain  classDomain);
	
	int update(Integer  classId); 
	
	int delete(Integer  classId);
}
