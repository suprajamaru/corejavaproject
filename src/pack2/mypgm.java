package pack2;

public class mypgm {
	static int a=m1() ;
	int b=10;
	static int m1() {
		System.out.println("m1 called");
		return new  mypgm(5,2).b;
		
	}
	mypgm(int a,int b){
		System.out.println("constructor called");
		System.out.println(b);
		System.out.println(a);
	}
	static {
		System.out.println("static block is created");
		
	}
	public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(mypgm.b); 
	}
	

}
