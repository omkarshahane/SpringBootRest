package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Course;
import com.demo.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao cd;
	
	@Override
	public Course addCourse(Course c) {
		
		cd.save(c);
		return c;
	}

	@Override
	public List<Course> getCourses() {
		
		
		return cd.findAll();
	}
	
	
	public Course updateCourse(Course c)
	{
		cd.save(c);
		
		return c;
	}

	@Override
	public void deleteCourse(int id) {
		
		Course c = cd.getReferenceById(id);
		
		cd.delete(c);
		
		
	}

}
