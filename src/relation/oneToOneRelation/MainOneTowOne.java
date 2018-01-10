package relation.oneToOneRelation;

public class MainOneTowOne {
	public static void main(String[] args) {
		// Create Department Entity
		Depart department = new Depart();
		department.setName("Development");
		// Create Employee Entity
		Employeee employee = new Employeee();
		employee.setEname("Satish");
		employee.setSalary(45000.0);
		employee.setDeg("Technical Writer");
		DaoOneToOne.insertEmployee(department, employee);
	}
}
