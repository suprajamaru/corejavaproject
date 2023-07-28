package pack2;

public class Autoboxing {
void meth1() {
	System.out.println("implementing autoboxing");
	int i=10;
	Integer i1=i;
	Integer i2=new Integer(i);
	Integer i3=Integer.valueOf(i);
	System.out.println("int PDT"+i);
	System.out.println("Integer i1 wco"+i1);
	System.out.println("integer i2 wco"+i3);
	System.out.println("-------");
	double d=0.14235689;
	Double d1=d;
	Double d2=new Double(d);
	Double d3=Double.valueOf(d);
	System.out.println(+d);
	System.out.println(+d1);
System.out.println(+d2);
System.out.println(+d3);
float f=1.2465f;
Float f1=f;
System.out.println(+f1);
char c='s';
Character c1=new Character(c);
System.out.println(+c);
System.out.println(+c1);
System.out.println("------");

}
void meth2() {
	System.out.println("implementing autounboxing");
	Byte b=new Byte((byte)20);
	byte b1=b;
	byte b2=b.byteValue();
	System.out.println("Byte wco"+b);
	System.out.println("byte PDT"+b1);
	System.out.println("byte PDT"+b2);
	
	System.out.println("------------");
	Float f=new Float(0.123f);
	float f1=f;
	float f2=f.floatValue();
	System.out.println(+f1);
	System.out.println(+f2);
	System.out.println("----");
}
void meth3()
{
	System.out.println("meth3 called");
	Short S=new Short("(short)500");
	//Short S1=new Short("(short)suppu");
	Boolean b=new Boolean(true);
	
	Boolean b1=new Boolean("True");
	
	
	
}


public static void main(String []args)
{
	Autoboxing obj=new Autoboxing();
	obj.meth1();
	obj.meth3();
}
}