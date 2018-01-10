package relation.OneToManyRelation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoOneToMany {

	public static boolean insertEmploye(EmployeeO e) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(e);
			entitymanager.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Excption in inserting Employe " + ex);
		} finally {
			entitymanager.close();
			emfactory.close();
		}
		return false;
	}

	public static boolean insertDepartment(DepartmentO d, List<EmployeeO> emps) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			
			for(EmployeeO ee : emps)
				entitymanager.persist(ee);
			d.setEmployeelist(emps);
			entitymanager.persist(d);
			entitymanager.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			System.out.println("Exception in inserting Department + " + ex);
		} finally {
			entitymanager.close();
			emfactory.close();
		}
		return false;
	}

}
