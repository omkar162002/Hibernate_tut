package Hibernate_tut.com.annotations;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	

    	
    	address add=new address();
    	add.setCity("pune");
    	add.setState("Maharastra");
    	add.setDate(new Date());
    	

    	Session session=factory.openSession();
    	session.beginTransaction();
    	

    	session.save(add);
    	
    	session.getTransaction().commit();
    	session.close();
    	
    	
    }
}

}
