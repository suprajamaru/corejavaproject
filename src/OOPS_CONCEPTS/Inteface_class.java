package OOPS_CONCEPTS;

public class Inteface_class implements InterfaceA,InterfaceB{
public	void GreenTea() {
	System.out.println("green tea ordered");
}
public void  TeaPowder()
{
	System.out.println(" tea powder ordered");
}
public int Soaps() {
	System.out.println("soaps ordered");
	return 10;

}
public void meth() {
	System.out.println("Interface B method implemented");
}
public static void main(String[] args) {
	Inteface_class in=new Inteface_class();
	in.GreenTea();
	in.TeaPowder();
	in.Soaps();
	in.meth();
	in.meth1();

	
	
}
}
