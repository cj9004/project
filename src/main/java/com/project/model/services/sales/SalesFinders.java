package com.project.model.services.sales;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.project.controllers.utils.HibernateUtil;

/**
 * Queries for Sales object
 * @author Cj
 * @since 7/10/2019
 *
 */
@Transactional
public class SalesFinders {
	
	public static List<String> findAllSales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT description FROM Sales");
		List<String> list = q.list();
		session.close();
		return list;		
	}
}
