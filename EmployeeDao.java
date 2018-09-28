package com.program.Employeees;


	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	 
	public class EmployeeDao {
	    
	    



		public Work get(Integer empId){
	        
	        Session session =null;
	        Work employee=null;
	        
	        try{
	            session = HibernateUtil.getsession();
	            employee = (Work)session.get(Work.class, empId);
	            
	        }catch(HibernateException e){
	            e.printStackTrace();
	        }finally{
	           HibernateUtil.closeSession(session);
	        }
	                
	        return employee;
	    }
	    
	    
	    public void insert(Work employee){
	        
	        Session session =null;
	        
	        try {
	            
	            session= HibernateUtil.getsession();
	            session.getTransaction().begin();
	            session.save(employee);
	            session.getTransaction().commit();
	            
	        }catch (HibernateException e){
	            e.printStackTrace();
	        }
	        finally{
	           HibernateUtil.closeSession(session);
	        }
	    }
	    
	    
	  public void update(Work employee){
	        
	        Session session =null;
	        
	        try {            
	            session= HibernateUtil.getsession();
	            session.getTransaction().begin();
	            session.update(employee);
	            session.getTransaction().commit();
	            
	        }catch (HibernateException e){
	            e.printStackTrace();
	        }
	        finally{
	            HibernateUtil.closeSession(session);
	        }
	    }
	  
	  
	  public void delete(Integer empId){
	        
	        Session session =null;
	        
	        try {
	            
	            session= HibernateUtil.getsession();
	            session.getTransaction().begin();
	            Work emp = (Work)session.get(Work.class, empId);
	            session.delete(emp);
	            session.getTransaction().commit();
	            
	        }catch (HibernateException e){
	            e.printStackTrace();
	        }
	        finally{
	            HibernateUtil.closeSession(session);
	        }
	    }
}
