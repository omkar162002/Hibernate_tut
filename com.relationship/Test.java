import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQestionId(105);
		q1.setQue("what is java");
		
		Answer a1=new Answer();
		a1.setAnswerId(210);
		a1.setAnswer("java is a programming language");
//		q1.setAns(a1);
		
		Answer a2=new Answer();
		a2.setAnswerId(211);
		a2.setAnswer("java is a open Sourse");
		
		Answer a3=new Answer();
		a3.setAnswerId(212);
		a3.setAnswer("java is a object oriented language");
		
		List list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAns(list);
		
		
		
		
		
		
		System.out.println("Done..");
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.getTransaction().commit();
		session.close();
	}

}
