package relation.inheritanceTablePerClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TeachingStaffDao {

	public TeachingStaffDao(){
		
	}
	
	public boolean insertTeachingStaff(){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "defaultPersistenceUnit" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	     try{
	      entitymanager.getTransaction( ).begin( );
	      //Teaching staff entity 
	      TeachingStaffTablePerClass ts1 = new TeachingStaffTablePerClass(1,"Gopal","MSc MEd","Maths");
	      TeachingStaffTablePerClass ts2 = new TeachingStaffTablePerClass(2, "Manisha", "BSc BEd", "English");
//	      //Non-Teaching Staff entity
//	      NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
//	      NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");
	      //storing all entities
	      entitymanager.persist(ts1);
	      entitymanager.persist(ts2);
	      entitymanager.getTransaction().commit();
	      return true;
	     }catch(Exception ex){
	    	 System.out.println("Failure in Inserting TeachingStaff Excption is :" + ex);
	     }finally {
	    	 entitymanager.close();
		     emfactory.close();
		}
		return false;
	}
}
