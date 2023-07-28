package OOPS_CONCEPTS;

import java.util.Scanner;

public class ClassB {
	Scanner sc=new Scanner(System.in);
	void meth1() {
		Encapsulation obj	=new Encapsulation();
		System.out.println("please enter emp name");
		obj.setEmpName(sc.nextLine());
		System.out.println("please enter emp dept");
		obj.setEmpDept(sc.next());
		System.out.println("please enter emp id");
		obj.setEmpId(sc.nextInt());
		System.out.println("please enter emp salary and exp");
		obj.setEmpSalary(sc.nextInt(),sc.nextInt());
	
		
		System.out.println("emp name"+obj.getEmpName());
		System.out.println("emp dept"+obj.getEmpDept());
		System.out.println("emp ID"+obj.getEmpId());
		System.out.println("emp salary"+obj.getEmpSalary());
		System.out.println("emp updated salary"+obj.getUpdated_Salary());
		
	}
	public static void main(String[] args) {
		new ClassB().meth1();
		
	}
	
	

}
