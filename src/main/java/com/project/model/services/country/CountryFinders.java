package com.project.model.services.country;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.project.controllers.utils.HibernateUtil;

/**
 * Queries for Country object
 * @author Cj
 * @since 6/10/2019
 *
 */
public class CountryFinders {

	public static List<String> findAllCountries() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT name FROM Country");
		List<String> list = q.list();
		return list;		
	}
	
	
}
