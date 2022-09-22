package com.example.Sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sample.dao.Coursedao;
import com.example.Sample.entities.Courses;

@Service
public class CourseServicesImpl implements CourseService {

	// List<Courses> list;
	@Autowired
	private Coursedao coursedao;

	public CourseServicesImpl() {
//		list =new ArrayList<>();
//		list.add(new Courses(145,"java course","This is basics of java"));
//		list.add(new Courses(140,"math course","This is basics of math"));
	}

	@Override
	public List<Courses> getCourses() {

		// return list;
		return coursedao.findAll();
	}

	@Override
	public Courses addCourse(Courses course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		coursedao.save(course);
		return course; 
	}

	@Override
	public String deleteCourse(Long id) {
		coursedao.deleteById(id);;
		return "Item_deleted";
	}
	

}
