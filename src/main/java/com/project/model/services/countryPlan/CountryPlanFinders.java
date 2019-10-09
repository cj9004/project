package com.project.model.services.countryPlan;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.controllers.utils.HibernateUtil;

/**
 * Queries for CountryPlan object
 * @author Cj
 * @since 7/10/2019
 *
 */
public class CountryPlanFinders {

	public static ArrayList<CountryPlan> finByOriginDestinationType(String origin, String destination, String type) {
		ArrayList<CountryPlan> list = new ArrayList<CountryPlan>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(" FROM CountryPlan p WHERE p.countryOrigin.id =:origin and p.countryDestination.id =:destination "
				+ " and p.placeType.id=:type");
		q.setParameter("origin", origin);
		q.setParameter("destination", destination);
		q.setParameter("type", type);
		list = (ArrayList<CountryPlan>) q.list();
		return list; 
	}

	public static ArrayList<CountryPlan> finAll() {
		ArrayList<CountryPlan> list = new ArrayList<CountryPlan>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(" FROM CountryPlan");		
		list = (ArrayList<CountryPlan>) q.list();
		return list;
	}

	public static CountryPlan findById(String planId) {
		CountryPlan plan = new CountryPlan();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(" FROM CountryPlan cp WHERE cp.id=:planId ");
		q.setParameter("planId", planId);
		plan = (CountryPlan) q.uniqueResult();
		return plan;
	}

}
