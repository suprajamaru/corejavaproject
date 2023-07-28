package OOPS_CONCEPTS;

public class car2 extends car {
void meth1() {
	System.out.println("creta car");
}
public static void main(String[] args) {
	car2 obj=new car2();
	obj.company();
	obj.wheels=4;
	
	obj.meth();
	obj.meth1();
	
}
}
