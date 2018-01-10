package relation.manyToOneRelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainManyToOne {

	/// in manyToOne You can access from many relation 
	
	public static void main(String[] args) {
		// Create Department Entity
		Department department = new Department();
		department.setName("Development");

		dao.insertDepartment(department);
		// Create Employee1 Entity
		Employe employee1 = new Employe();
		employee1.setEname("Satish");
		employee1.setSalary(45000.0);
		employee1.setDeg("Technical Writer");
		employee1.setDepartment(department);

		// Create Employee2 Entity
		Employe employee2 = new Employe();
		employee2.setEname("Krishna");
		employee2.setSalary(45000.0);
		employee2.setDeg("Technical Writer");
		employee2.setDepartment(department);

		// Create Employee3 Entity
		Employe employee3 = new Employe();
		employee3.setEname("Masthanvali");
		employee3.setSalary(50000.0);
		employee3.setDeg("Technical Writer");
		employee3.setDepartment(department);

		// Store Employees
		if (dao.insertEmployee(employee1, department)) {
			System.out.println("insertion successfully for " + employee1);
		}
		if (dao.insertEmployee(employee2, department)) {
			System.out.println("insertion successfully for " + employee2);
		}
		if (dao.insertEmployee(employee3, department)) {
			System.out.println("insertion successfully for " + employee3);
		}

	}
}
