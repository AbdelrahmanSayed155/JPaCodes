package relation.oneToOneRelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoOneToOne {

	public static boolean insertEmployee(Depart d, Employeee e) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(d);
			e.setDepartment(d);
			entitymanager.persist(e);
			entitymanager.getTransaction().commit();
		} catch (Exception Ex) {
			System.out.println("Exception in Inserting Employee " + Ex);
		} finally {

			entitymanager.close();
			emfactory.close();
		}
		return false;
	}

}
