package SLTDemos;

public class EmployeeMain {
	public static void main(String arg[])
	{
		SalariedEmployee employeeObj=new SalariedEmployee();
	
		//Using setter method we have initialized the object
		employeeObj.setEmployeeId("E1001");
		employeeObj.setEmployeeName("Suresh Kumar");
		
		employeeObj.setSalary(60000);
		
		//Using getter method we can display the object values.
		System.out.println("Employee ID:"+employeeObj.getEmployeeId());
		System.out.println("Employee Name:"+employeeObj.getEmployeeName());
		
		System.out.println("Salary:"+employeeObj.getSalary());
	}
}


