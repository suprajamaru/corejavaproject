package OOPS_CONCEPTS;

public class method_overriding {
void meth1() {
	System.out.println("parent class method");
}
String meth2() {
	System.out.println(10);
	return "suppu";
}
int meth3() {
	System.out.println(20);
	return 10;
}
void meth1(char c) {
	System.out.println("parent meth1()"+c);
}
protected void meth3(int a,String s) {
	System.out.println(30);
}
static void meth5() {
	System.out.println("parent class static method");
}
final method_overriding  meth6() {
	System.out.println("parent meth6");
	return new method_overriding();
}
}
