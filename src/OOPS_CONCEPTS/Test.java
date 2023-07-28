package OOPS_CONCEPTS;

public class Test implements InfA {
public String getName() {
	System.out.println("Interface A METHOD EXECUTED");
	return "java is awesome";
}
public static void main(String[] args) {
	Test t=new Test();
	System.out.println(t.getName());
}
}
