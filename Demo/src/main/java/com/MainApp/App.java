package com.MainApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

public class App 
{
	
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction(); //for commit
        
        Employee e = new Employee();
        e.setEid(101);
        e.setEname("shaym");
        e.setEsalary(2000);
        
        s.save(e);//
        t.commit(); //
    }
}
