package org.maven.service;

import java.util.List;

import org.maven.beans.ScoreDomain;



public interface ScoreService {
	int  getScoreBystudentId(Integer  studentId);
	
	int  getScoreBycoursId(Integer  courseId);
	
	int  insert(ScoreDomain  scoreDomain);
	
	int  updateOfStudentId(Integer  studentId);
	
	int  delete(Integer  studentId);
	
	List<ScoreDomain>  selectStudentsOfCourseId(Integer  courseId);
}
