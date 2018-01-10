package singleTable.main.model.dao;



import java.util.List;

public class MainClass {
	
	public static void main(String []args){
		
		
       EmpDao dao = new EmpDao();
		
		List<Employee>  employees = dao.getEmployeAtLast_X_Hours(30);
		System.out.println("\n\n\n\n\n\n\n ---------- Printing All Employees  ------ \n\n\n"); 
		for(Employee e :employees){
			System.out.println(e.toString());
		}
		
//		EmpDao dao = new EmpDao();
//		
//		List<Employee>  employees = dao.getEmployesAtLast_X_Minutes(20);
//		System.out.println("\n\n\n\n\n\n\n ---------- Printing All Employees  ------ \n\n\n"); 
//		for(Employee e :employees){
//			System.out.println(e.toString());
//		}
		
		
//		List<Employee>  employees = dao.getEmployes();
//		System.out.println("\n\n\n\n\n\n\n ---------- Printing All Employees  ------ \n\n\n"); 
//		for(Employee e :employees){
//			System.out.println(e.toString());
//		}
		
		//EmpDao dao = new EmpDao();
//		for(int y=0;y<10;y++){
//		if(dao.insertEmploye(new Employee())){
//			System.out.println("Success inserting Employe  ");
//		}else{
//			System.out.println("Failing  inserting Employe  ");
//		}
//		}
		
		
	      
		
	}

}
