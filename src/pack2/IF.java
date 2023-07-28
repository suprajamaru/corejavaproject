package pack2;

public class IF {
	void meth1(int a) {
		System.out.println("meth 1 called");
	if(a<=100)
	System.out.println("hi");
	//System.out.println("java is awesome");
	else
		System.out.println("else block executed");
		System.out.println("hello");
	}
	void meth2(int a,int b, int c) {
		if(a<=10) {
			if(b<=20)
				System.out.println(b+"b value printed");
			else
			
			System.out.println("");
			System.out.println("a value printed");
		}
		else
			
		{
			if(c>=50)
			System.out.println("c value printed");
		else
			System.out.println("");
		}
	}
public static void main(String[] args) {
	new IF().meth1(200-'a');
	new IF().meth2(20,20,50);
}
}
