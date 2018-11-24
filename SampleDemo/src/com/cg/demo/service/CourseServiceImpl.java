package com.cg.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.beans.Course;
import com.cg.demo.dao.ICourseDao;
@Service
@Transactional
public class CourseServiceImpl implements ICourseService{

	@Autowired
	ICourseDao dao;
	
	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
	

}
