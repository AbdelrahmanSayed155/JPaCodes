package singleTable.main.model.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpDao {

	public boolean insertEmploye(Employee employee) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");

		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			//////// getting current date
			Calendar date = Calendar.getInstance();
			long t = date.getTimeInMillis();
			//////////// inserting New Employee

			employee.setName("AbdelrahmanSayed");
			employee.setEmail("abdelrahmanSayed@gmail.com");
			employee.setEmploymentDate(new Date(t));

			entitymanager.persist(employee);
			entitymanager.getTransaction().commit();

			return true;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in insertion Employee  : " + e);

		} finally {
			System.out.println(" Finnaly Erea \n" );
			entitymanager.close();
			emfactory.close();
		}

		return false;
	}

	public boolean updateEmploye(Employee updateEmployee) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");

		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			
			entitymanager.merge(updateEmployee);
//			Employee employee = entitymanager.find(Employee.class, updateEmployee.getId());
//
//			// before update
//			System.out.println(employee);
//			////
//			employee = updateEmployee;
			entitymanager.getTransaction().commit();

			// after update
			System.out.println(updateEmployee);

			return true;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in update  Employee  : " + e);

		} finally {
			entitymanager.close();
			emfactory.close();
		}

		return false;
	}

	public boolean deleteEmploye(Employee deletedemployee) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();

		try {
			entitymanager.getTransaction().begin();
			//Employee employee = entitymanager.find(Employee.class, deletedemployee.getId());
			//entitymanager.remove(employee);
			entitymanager.remove(deletedemployee);
			entitymanager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in Deleting   Employee  : " + e);

		} finally {
			entitymanager.close();
			emfactory.close();
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployes() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			Query query = entitymanager.createQuery("SELECT e FROM Employee e");
			List<Employee> Emplo = query.getResultList();
			entitymanager.getTransaction().commit();
			return Emplo;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in Getting All  Employees  : " + e);
		} finally {
			entitymanager.close();
			emfactory.close();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployesAtLast_X_Minutes(int X) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			//////// calculating munites 
	        long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	        Calendar date = Calendar.getInstance();
	        long t= date.getTimeInMillis();
	        Date afterAddingTenMins=new Date(t - (X * ONE_MINUTE_IN_MILLIS));
	        System.out.println(afterAddingTenMins);
	        
			Query query = entitymanager.createQuery("SELECT e FROM Employee e where e.employmentDate >:registerDate");
			query.setParameter("registerDate", afterAddingTenMins);
			List<Employee> Emplo = query.getResultList();
			entitymanager.getTransaction().commit();
			return Emplo;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in Getting All  Employees  : " + e);
		} finally {
			entitymanager.close();
			emfactory.close();
		}
		return null;
		
		
	}

	public List<Employee> getEmployeAtLast_X_Hours(int X) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("defaultPersistenceUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			//////// calculating munites 
	        long ONE_HOUR_IN_MILLIS=3600000;//millisecs
	        Calendar date = Calendar.getInstance();
	        long t= date.getTimeInMillis();
	        Date afterAddingTenMins=new Date(t - (X * ONE_HOUR_IN_MILLIS));
	        System.out.println( " Date >>>>" +afterAddingTenMins);
	        
			Query query = entitymanager.createQuery("SELECT e FROM Employee e where e.employmentDate >:registerDate");
			query.setParameter("registerDate", afterAddingTenMins);
			List<Employee> Emplo = query.getResultList();
			entitymanager.getTransaction().commit();
			return Emplo;
		} catch (Exception e) {
			entitymanager.getTransaction().rollback();
			System.out.println(" Exception in Getting All  Employees  : " + e);
		} finally {
			entitymanager.close();
			emfactory.close();
		}
		return null;
		
	}
	
	

}
