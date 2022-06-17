package week1.day2;

public class EmployeeDetails 
{
	
	public static void main(String[] args) 
	{
		EmployeeDetails objectEmp = new EmployeeDetails();
		objectEmp.printEmployeeName("Nirmal", 0710);
		String EmpAdd = objectEmp.getEmployeeAddress("Tambaram, Chennai");
		System.out.println(EmpAdd);
		objectEmp.printEmpSalary(123456.7890);
		long mobileNum = objectEmp.empMobileNumber(12345678901234L);
		System.out.println("Employee Mobile Number:" + mobileNum);
	}
	
public void printEmployeeName(String empName, int empId)
{
	System.out.println("Employee Name:" + empName + "Emp ID:" + empId + " ");
	
}
private String getEmployeeAddress(String empAddress)
{
	return "Employee Address: " + empAddress;
}
public void printEmpSalary(double empSalary)
{
	System.out.println("Employee Salary:" + empSalary);
}
private long empMobileNumber(long mobNumber) 
{
	return mobNumber;
}
}


