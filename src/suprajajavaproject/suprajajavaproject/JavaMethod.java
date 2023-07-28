package suprajajavaproject;

public class JavaMethod {
	void meth1() {
		System.out.println(10);
		System.out.println(64);
		System.out.println("END");
	}
int meth2(int a,int b,int c) {//called by meth4 a=50,b=50,c=50
	System.out.println(a);
	JavaMethod bobj=new JavaMethod();
	String L=bobj.meth5(100,"java is awesome");//calling meth5
	System.out.println(L);
	return a-b;
	
	
}
String meth3(String s,int b,int d)//called by meth5 s=hi,b=15,d=10;
{
	System.out.println(b+d);
	return s;

}
int meth4(int c,int k) {//called by main() c=20,k=10
	System.out.println(k);
	JavaMethod bobj=new JavaMethod();
	int result=bobj.meth2(50,50,50);//calling meth2
	System.out.println(result);//result=a-b=50-50=0
	return k+10;//10+10=20

	
	
}
String meth5(int a,String L)//called by meth2 a=100 L=java is awesome
{
	System.out.println(a+a);
	JavaMethod bobj=new JavaMethod();
	String s=bobj.meth3("Hi", 15, 10);//calling meth3 
	System.out.println(s);
	return L;
	
	
}	
	
	public static void main(String[] args) {
		JavaMethod bobj=new JavaMethod();
		System.out.println("Start");
		int result=bobj.meth4(20,10);//calling meth4
		System.out.println(result);//result=k+10=10+10=20
		bobj.meth1();
		
}

}
 