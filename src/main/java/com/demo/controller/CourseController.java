package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Course;
import com.demo.service.CourseService;

@RestController
public class CourseController {
	
	
	@Autowired
	CourseService cs;
	
	@GetMapping("/course")
	public List<Course> getAllCourses()
	{
		
		return this.cs.getCourses();
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course c)
	{
		return this.cs.addCourse(c);
		
	}
	
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable int id)
	{
		cs.deleteCourse(id);
	}

}
