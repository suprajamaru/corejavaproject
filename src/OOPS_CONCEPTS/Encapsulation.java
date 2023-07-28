package OOPS_CONCEPTS;
public class Encapsulation{

	private String empName;
	private String empDept;
	private int empId;
	private int empSalary;
	private int updated_salary;

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		int empSalary=updated_salary;
		return updated_salary;
	}
	public void setEmpSalary(int empSalary,int empExp) {
		this.empSalary = updated_salary;
		System.out.println("present salary"+empSalary);
		int Bonus_Amount=empSalary*10/100;
		int Bonus_Amount1=empSalary*5/100;
		int  updated_salary=empSalary+Bonus_Amount;
		int  updated_salary1=empSalary+Bonus_Amount;
	
	//public int getEmpExp() {
		//return empExp;
	//}
//	public void setEmpExp(int empExp) {
		
		if(empExp>=5)
		{
		// int updated_salary=empSalary*10/100;

			System.out.println("increase emp salary by 10%"+updated_salary );
		}
		else if(empExp<5){
			System.out.println("increase emp salary by 5%" +updated_salary1);
		}
	}
	public int getUpdated_Salary() {
		
		return updated_salary ;
	}
	
	
	

}



