package suprajajavaproject;

public class ClassC {
void meth1() {
	System.out.println("veeksha");
	
}
int meth2(int a,int b) {
	System.out.println("hi");
	new ClassC().meth1();
	return a+b;
}

	public static void main(String[] args) {
		ClassC a=new ClassC();
		int result = a.meth2(10,5);
		System.out.println(result);
	}

}
