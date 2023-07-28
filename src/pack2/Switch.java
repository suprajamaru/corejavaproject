package pack2;

public class Switch {
	void meth1(int a, final int b,String s) {
		final int c=100;
		System.out.println("meth1 is implementing");
		switch(c) {
		case 10:
			System.out.println("case 10 executed");
			break;
		case 'a':
			System.out.println("int &char both are compatable");
			if(a<=10)
				System.out.println("if executed");
			else
				System.out.println("else executed ");
			break;
			default:
				System.out.println("default case executed");
				break;
		
		
			case c:
				System.out.println("case c executed");
			
			switch(s) {
			case "java":
				System.out.println("case java executed ");
			
				new Switch().meth2();
				break;
			}
			System.out.println("compiler came out of switch block");
		}
		System.out.println("compiler came out of switch block");
	}
		
		Switch()
	{
		System.out.println("constructor called");
			
		}
		void meth2() {
			System.out.println("meth2 called");
		}
		
	
public static void main(String[] args) {
	new Switch().meth1(97,30,"java");
}
}
