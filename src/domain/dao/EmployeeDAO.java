package domain.dao;
import domains.Employee;

public class EmployeeDAO {
	
	
	public static void  saveEmployee (Employee employee){
		/*DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
		connectionManager.connect();
		connectionManager.getConnectionObject().prepareStatement("insert into employee_tbl");
		connectionManager.disconnect();
		*/
		
		System.out.println("Employee Saved to database");
	}
	
	
   public static void deleteEmployee (Employee employee){
	   System.out.println("Employee deleted from database");
	}

	
	
	

}
