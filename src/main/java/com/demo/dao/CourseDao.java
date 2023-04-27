package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {
	


}
