package relation.inheritanceTablePerClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NonTeachingStaffDao {
	
	
	public NonTeachingStaffDao(){	
		
	}
	
	boolean insertNonTeachingStaff(/*NonTeachingStaff nonTeachingStaff*/){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "defaultPersistenceUnit" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	     try{
	      entitymanager.getTransaction( ).begin( );
	      NonTeachingStaffTablePerClass nts1 = new NonTeachingStaffTablePerClass(3, "Satish", "Accounts");
	      NonTeachingStaffTablePerClass nts2 = new NonTeachingStaffTablePerClass(4, "Krishna", "Office Admin");
	      //storing all entities
	      entitymanager.persist(nts1);
	      entitymanager.persist(nts2);
	      entitymanager.getTransaction().commit();
	      return true;
	     }catch(Exception ex){
	    	 System.out.println("Failure in Inserting NonTeachingStaff Excption is :" + ex);
	     }finally {
	    	 entitymanager.close();
		     emfactory.close();
		}
		return false;
	}
}
