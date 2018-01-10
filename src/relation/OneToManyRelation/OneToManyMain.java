package relation.OneToManyRelation;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMain {
	

	public static void main(String [] args){
	   //Create Employee1 Entity
	   EmployeeO employee1 = new EmployeeO();
	   employee1.setEname("Satish");
	   employee1.setSalary(45000.0);
	   employee1.setDeg("Technical Writer");

	   //Create Employee2 Entity
	   EmployeeO employee2 = new EmployeeO();
	   employee2.setEname("Krishna");
	   employee2.setSalary(45000.0);
	   employee2.setDeg("Technical Writer");

	   DepartmentO department = new DepartmentO();
	   department.setName("Development");
	   
	   
	   //Create Employee3 Entity
	   EmployeeO employee3 = new EmployeeO();
	   employee3.setEname("Masthanvali");
	   employee3.setSalary(50000.0);
	   employee3.setDeg("Technical Writer");

	  
	   //Store Employee
//	  DaoOneToMany.insertEmploye(employee1);
//	  DaoOneToMany.insertEmploye(employee2);
//	  DaoOneToMany.insertEmploye(employee3);

	   //Create Employeelist
	   List<EmployeeO> emplist = new ArrayList<EmployeeO>();
	   emplist.add(employee1);
	   emplist.add(employee2);
	   emplist.add(employee3);

	   //Create Department Entity

	   department.setEmployeelist(emplist); 
	   
	   //Store Department
	   System.out.println(DaoOneToMany.insertDepartment(department, emplist));
	   
	   
	   }


}
