package com.project.model.services.placeType;

import java.util.ArrayList;
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
	public static ArrayList<PlaceType> findAllPlaceType() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(" FROM PlaceType");
		ArrayList<PlaceType> list = (ArrayList<PlaceType>) q.list();
		return list;		
	}
}
