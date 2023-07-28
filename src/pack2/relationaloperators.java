package pack2;



public class relationaloperators {

	

void meth1() {
	int x=10;
	if(x!=10) {
		System.out.println("condition true");
		System.out.println("hello");
	}
	else {
		System.out.println("condition false");
		System.out.println("hi");
	}
}
relationaloperators(int age,String name)
{
	if(age>=18) {
		System.out.println(name+" is eligible for voting");	
		}
	else {
		System.out.println(name+ " not is eligible for voting"+"you have to wait untill" +(18-age)+"years");
		
	}
}
	relationaloperators(int empage,String empname,int salary){
		if(!(salary<=20000||empage<=30)) {
			System.out.println("condition is true");	
		}
		else
		{
			System.out.println("condition is false");
		}
	}
	

public static void main(String[]args)
{
	relationaloperators obj=new relationaloperators(27,"supraja");
	obj.meth1();
	relationaloperators obj1=new relationaloperators(40,"supraja",30000);
}
}
