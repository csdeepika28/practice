package com.deepu2.model;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Student std=new Student(1, "deepu","vishnu");
		Session session = null;
		session = SessionUtil.getSession();
		session.getTransaction().begin();
		session.save(std);
		session.getTransaction().commit();
		SessionUtil.closeSession(session);

		}
	}

