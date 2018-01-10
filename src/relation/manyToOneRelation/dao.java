package relation.manyToOneRelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class dao {
	
	
	public static boolean insertEmployee(Employe e , Department d){
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "defaultPersistenceUnit" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		 try{
		   entitymanager.getTransaction( ).begin( );
		   e.setDepartment(d);
		   entitymanager.persist(e);
		   entitymanager.getTransaction().commit();
		 }catch(Exception ex){
			 System.out.println("The Exception in inserting Employee " +e +"the exception is " + ex );
		 }finally {
			   entitymanager.close();
			   emfactory.close();
		}
		return false;
	}
	
	public static boolean insertDepartment(Department d){
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "defaultPersistenceUnit" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		 try{
		   entitymanager.getTransaction( ).begin( );
		   entitymanager.persist(d);
		   entitymanager.getTransaction().commit();
		 }catch(Exception ex){
			 System.out.println("The Exception in inserting Company  " +d+"the exception is " + ex );
		 }finally {
			   entitymanager.close();
			   emfactory.close();
		}
		return false;
	}
	

}
