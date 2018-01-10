package relation.inheritanceJoinedTable;

public class MainClass {
	
	public static void main(String []args){
		TeachingStaffDao teachingStaffDao  = new TeachingStaffDao();
		NonTeachingStaffDao nonTeachingStaffDao = new NonTeachingStaffDao();
		//// 
		teachingStaffDao.insertTeachingStaff();
		nonTeachingStaffDao.insertNonTeachingStaff();
	}
}
