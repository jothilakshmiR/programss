package com.program.Employeees;



import org.hibernate.Session;


import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


 
@SuppressWarnings("deprecation")
public class HibernateUtil {
    
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    
    private static org.hibernate.SessionFactory sessionFactory;
    
    static {
        try{
            
        	  Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Work.class);
              
          
          
            ServiceRegistry reg =  new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
            sessionFactory = con.buildSessionFactory(reg);        
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private HibernateUtil(){}
    
    public static Session getThreadLocalSession() {
        Session session = (Session) threadLocal.get();
         
        if (session == null) {
         session = sessionFactory.openSession();
            threadLocal.set(session); 
         }
        
        return session; 
     }
    
    
    public static void closeThreadLocalSession() {
        
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);
        if (session != null) {
        session.close();        
        }
    }
    
    public static Session getsession() {
            return sessionFactory.openSession();
    }
    
    public static void closeSession(Session session) {
        if (session != null) {
            session.close();
        }
    }


    }

