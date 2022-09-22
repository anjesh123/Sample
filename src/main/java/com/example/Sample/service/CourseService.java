package com.example.Sample.service;

import java.util.List;

import com.example.Sample.entities.Courses;

public interface CourseService {
   
	List<Courses> getCourses();
	
	Courses addCourse(Courses course);
	Courses updateCourse(Courses course);
	String deleteCourse(Long id);
}
