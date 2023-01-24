package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
   
    	Sandeep3 sa=new Sandeep3();
    	sa.setAid(104);
    	sa.setAname("sandeep");
    	sa.setColor("green");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Sandeep3.class);
    	//This line is use for dupricated method
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(sa);
    	tx.commit();
    	
    }
}
