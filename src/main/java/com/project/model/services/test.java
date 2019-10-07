package com.project.model.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.model.services.country.Country;

public class test {

	public static void main(String[] args) {
		
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		Session sess = s.openSession();
		sess.beginTransaction();
		Country services = new Country();
		services.setId("1");
		services.setName("name1");
		sess.save(services);
		sess.getTransaction().commit();
		System.out.println("start");
		


	}

}
