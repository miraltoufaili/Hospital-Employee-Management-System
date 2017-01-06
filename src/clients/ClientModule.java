package clients;
import Report.EmployeeReportFormatter;
import domain.dao.EmployeeDAO;
import domains.Employee; 



public class ClientModule {
	
	
	public static void hireNewEmployee(Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		EmployeeDAO.saveEmployee(employee);
		
	}
	
	public static void terminateEmployee (Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		EmployeeDAO.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport (Employee employee){
		EmployeeReportFormatter.getFormattedEmployee();
	}
}
