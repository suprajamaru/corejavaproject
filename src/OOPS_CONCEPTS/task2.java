package OOPS_CONCEPTS;

public class task2 extends task1 {
void display() {
	System.out.println("hi");
	super.meth4();
}
static int show(int a) {
	System.out.println(a+a);
	return a+ a++;//100
}
task2(){
	this(show(50));//100
	for(int i=1;;i++) {
		super.meth4();
		break;
	}
	System.out.println("hi");
	System.out.println(show(50));
}
task2(int a){//a=100
	System.out.println("==>"+(a++ + show(50)));
}
public static void main(String[] args) {
	new task2().display();
}
}
