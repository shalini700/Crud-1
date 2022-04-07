package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ShaliniStudent;

@Repository
@Transactional
public class ShaliniStudentRepository {
	
	@Autowired
	EntityManager em;
		public ShaliniStudent findById(int id) {
		return	em.find(ShaliniStudent.class, id);
		}
	 
		public ShaliniStudent save (ShaliniStudent shalinistudent ) {
			if(shalinistudent.getId()==0) {
				em.persist(shalinistudent);
			}else {
			em.merge(shalinistudent);
			}
			return shalinistudent;
		}
		
		
		
		public void DeleteById(int id) {
			ShaliniStudent shalinistudent = findById( id) ;
			em.remove(shalinistudent);
		}
}
