package com.project.model.services.placeType;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.controllers.utils.HibernateUtil;

/**
 * Queries for PlaceType object
 * @author Cj
 * @since 7/10/2019
 *
 */
public class PlaceTypeFinders {

	/**
	 * @return the list of all the Places Type name
	 */
	public static List<String> findAllPlaceType() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT name FROM PlaceType");
		List<String> list = q.list();
		return list;		
	}
}
