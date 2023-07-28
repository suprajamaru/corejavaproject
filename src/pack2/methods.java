package pack2;

public class methods {


Boolean meth1() {
	System.out.println("meth1 called");
	int i=10;
	if(i<=10)
	{
		System.out.println("if statement executed");
		return true;
	}
	else
	{
		System.out.println("else statement executed");
		return false;
	}
}
Float meth2(double a,double b) {
	
	 System.out.println("meth2 executed");
	 System.out.println(a+b);
	 return (float) 0.1123458 ;
		
	}
protected void finalize() {
	System.out.println("garbage has been collected");
}
public static void main(String []args) {
	methods m=new methods();
	System.out.println(m.meth1());
	System.out.println(m.getClass());
	System.out.println(m.hashCode());
	System.out.println("----------");

	//System.out.println(new methods().hashCode());
	//System.out.println(new methods().getClass());
	//System.out.println(m.equals(new methods()));
	//System.out.println(new methods().meth2(0.1, 0.22));
	System.out.println("------------------");
	System.out.println(m.toString());
	m=null;
	System.gc();
	
	
}
}

