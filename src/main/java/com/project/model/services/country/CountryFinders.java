package com.project.model.services.country;


import java.util.ArrayList;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.project.controllers.utils.HibernateUtil;

/**
 * Queries for Country object
 * @author Cj
 * @since 6/10/2019
 *
 */
@Transactional
public class CountryFinders {

	public static ArrayList<Country> findAllCountries() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Country> q = session.createQuery(" FROM Country");
		ArrayList<Country> list = (ArrayList<Country>) q.list();
		session.close();
		return list;		
	}
	
	
}
