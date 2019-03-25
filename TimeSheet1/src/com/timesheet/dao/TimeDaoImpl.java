package com.timesheet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.timesheet.dto.TimeSheet;

@Repository
@Transactional
public class TimeDaoImpl implements TimeDao {

	
   @PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void addDetails(TimeSheet time) {
		
		
		entityManager.persist(time);
		entityManager.flush();
	
		
	}





	@Override
	public List<TimeSheet> getTimeDetails(String id){
		List<TimeSheet> acc=null;
		String qStr = "SELECT e FROM TimeSheet e WHERE e.empid='"+id+"'";
		TypedQuery<TimeSheet> query = entityManager.createQuery(qStr, TimeSheet.class);
		//query.setParameter("pempid", id);
		
		 acc = query.getResultList();
		 System.out.println(acc);
		
		return acc;
		
	}
}
