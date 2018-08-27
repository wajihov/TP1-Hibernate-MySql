package com.mkyong.common;

import com.mkyong.persistence.HibernateUtil;
import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Stock st = new Stock();
		st = new Stock("HJKLO", "4521");

		session.save(st);
		session.getTransaction().commit();
	}
}
