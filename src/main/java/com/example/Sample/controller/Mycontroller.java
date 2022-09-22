package com.example.Sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.entities.Courses;
import com.example.Sample.service.CourseService;

@RestController
public class Mycontroller {
	 
	@Autowired
	private CourseService courseservice;
	
	  @GetMapping("/home1")
	   public String home()
	   {
		  return "welcome to Spring Boot";
	   }
	  @GetMapping("/courses")
	  public List<Courses> getCourses()
	  {
		  return this.courseservice.getCourses();
	  }
	  @PostMapping("/courses")
	  public Courses addCourse(@RequestBody Courses course)
	  {

		//  System.out.println(course.getDescription());
		  return this.courseservice.addCourse(course);
	  }
	  @PutMapping("/courses")
	  public Courses updateCourse(@RequestBody Courses course)
	  {
		  return this.courseservice.updateCourse(course);
	  }
	 
	  @DeleteMapping("/courses/{id}")
	  public String deleteCourse(@PathVariable Long id)
	  {
		  return this.courseservice.deleteCourse(id);
	  }

}
