package com.cg.demo.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.demo.beans.Course;
@Repository
public class CourseDaoImpl implements ICourseDao{
      
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Course> getAll() {
		
		Query query=(Query) em.createQuery("select c from Course c");
		List<Course> list=query.getResultList();
		return list;
		
	}
	
	
	

}
