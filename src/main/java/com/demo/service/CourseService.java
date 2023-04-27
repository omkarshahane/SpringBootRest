package com.demo.service;

import java.util.List;

import com.demo.bean.Course;

public interface CourseService {
	
	public Course addCourse(Course c);
	public List<Course> getCourses();
	public Course updateCourse(Course c);
	public void deleteCourse(int id);
	

}
