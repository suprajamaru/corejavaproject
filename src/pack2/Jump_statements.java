package pack2;

public class Jump_statements {
int meth1() {
	System.out.println("implementing jump statements");
	int i=1;
	while(i<=10) {
		
		if(i==5) {
			//break;
			//continue;
			return 10;
		}
		System.out.println("i value"+i++);
		//i++;
		//System.out.println("continue");
	}
	System.out.println("for loop");
	for(int j=1;j<=10;j++) {
		if(j==4) {
		//return 20;
		}
		System.out.println("j value" +j);
	}
	System.out.println("compiler came out from loop");
	return 30;
}
void meth2() {
	int x=new Jump_statements().meth1();
	System.out.println(x);
}
public static void main(String[] args) {
	new  Jump_statements().meth2();
}
}
