

public class ClassB {
	String meth1(int a,int b) {//called by meth4 a=4,b=8
		System.out.println(10);
		System.out.println((54+a)-b);//54+4-8=50
		int value=new ClassB().meth5();//calling meth5 value=20
		System.out.println(value);
		return "java";
	}
	protected int meth2(int a)//called by meth5 a=5
	{
		System.out.println(75);
		int b=5;
		
		System.out.println(b-a);//5-5=0
		return (5*5)-b;//25-5=20
	}
	void meth3() {//called by main
		System.out.println("Start");
		System.out.println(new ClassB().meth4());//calling meth4 and meth4 return java
		System.out.println(40);
	}
	String meth4() {//called by meth3
		System.out.println("today is saturday");
		return new ClassB().meth1(4, 8);//calling meth1 and meth1 return java
	}
	int meth5() {//called by meth1
		ClassB obj=new ClassB();
		System.out.println(99);
		return obj.meth2(5);//calling meth2,meth2 return 20
	}
	public static void main(String[] args) {
		ClassB aobj=new ClassB();
		aobj.meth3();//calling meth3

	}

}
