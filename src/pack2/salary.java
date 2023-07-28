package pack2;

public class salary {
void meth1(int salary,int year_exp) {
	
	int Bonus_amount=salary*5/100;
	int updated_salary=salary+Bonus_amount;
	if(year_exp>=5) {
		System.out.println("employ will get bonus"+Bonus_amount);
		System.out.println("updated salary"+ updated_salary);
	}
	else
		System.out.println("employ will not get bonus");
	
}
public static void main(String[] args) {
	new  salary().meth1(80000, 4);
}
}
