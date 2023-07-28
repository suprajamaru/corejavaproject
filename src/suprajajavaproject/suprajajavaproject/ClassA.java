package suprajajavaproject;

public class ClassA {
	public void meth1() {
		int a=10;
		int b=11;
		System.out.println(a+b);
	
	}
public void meth2() {
	int a=10;
	int b=a;
	System.out.println(b);
	ClassA aobj=new ClassA();
	aobj.meth1();
}
public void meth3() {
	
System.out.println("meth3 called");	
}
void meth4() {
 System.out.println();
	
}
public static void main(String []args) {
	System.out.println("main method called");
	ClassA aobj=new ClassA();

	aobj.meth2();
	
	
}
}
