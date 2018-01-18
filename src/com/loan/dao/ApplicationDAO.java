package com.loan.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





import com.loan.entity.Application;
import com.loan.entity.Applicationshort;
import com.loan.entity.bereaudata;



@Repository("applicationDAO")
public class ApplicationDAO implements IApplicationDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addApplication(Application application) {
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().save(application);
			sessionFactory.getCurrentSession().getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			sessionFactory.getCurrentSession().getTransaction().rollback();
			return false;
		}
	}
	
	public List<Applicationshort> getApplicationsDAO() {
		
		try{
			sessionFactory.getCurrentSession().beginTransaction();
			Criteria cr = sessionFactory.getCurrentSession().createCriteria(Application.class)
				    .setProjection(Projections.projectionList()
				      .add(Projections.property("key"), "shortkey")
				      .add(Projections.property("firstname"), "shortfirstname")
				      .add(Projections.property("submissiondate"), "shortsubmissiondate")
				      .add(Projections.property("status"),"shortstatus")
				      .add(Projections.property("lastname"),"shortlastname"))
				    .setResultTransformer(Transformers.aliasToBean(Applicationshort.class));
			List<Applicationshort> list = cr.list();
			sessionFactory.getCurrentSession().getTransaction().commit();
			return list;
		}catch(Exception e) {
			sessionFactory.getCurrentSession().getTransaction().rollback();
			return Collections.EMPTY_LIST;
		}
			
	
		
	}

	public List<Application> findApplicationByString(Integer searchText) {
		sessionFactory.getCurrentSession().beginTransaction();
		try {
			Criteria crit = sessionFactory.getCurrentSession().createCriteria(Application.class);
			//If there is a search string, put a criteria using the same
			if (searchText != null) {
				crit.add(Restrictions.like("key", searchText));
			}	
			@SuppressWarnings("unchecked")
			List<Application> all = crit.list();
			return all;
		} finally {
			sessionFactory.getCurrentSession().getTransaction().commit();
		}
	}
	
	public bereaudata getbereaudata(Integer SSN){
		sessionFactory.getCurrentSession().beginTransaction();
		try{
			Criteria cra = sessionFactory.getCurrentSession().createCriteria(bereaudata.class);
				   cra.add(Restrictions.eq("id",SSN));
			bereaudata data = (bereaudata)cra.uniqueResult();
			return data;
		}finally{
			sessionFactory.getCurrentSession().getTransaction().commit();
		}
		
		
	}

}
