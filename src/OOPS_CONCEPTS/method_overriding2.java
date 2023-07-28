package OOPS_CONCEPTS;

public class method_overriding2 extends  method_overriding{
void meth1(){//overriding method {
	System.out.println("method_overriding2 method");
}
String meth2() {
	System.out.println(1);
	return "java";
}
int meth3() {
	System.out.println(2);
	return 2;
}
void meth1(char x) {
	System.out.println(3);
}
public void meth3(int a, String s) {
	System.out.println(4);
}
static void meth5() {
	System.out.println("child class static method");
}
}
 /*method_overriding2  meth6() {
	System.out.println("parent meth6");
	return new method_overriding2();
}*/




