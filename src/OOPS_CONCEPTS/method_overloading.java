package OOPS_CONCEPTS;
//java.lang.StringBuffer;
public class method_overloading {
  void meth1() {
	  System.out.println("meth1 called");
  }
  public final void meth1(int a) {
	  System.out.println(10);
  }
  public int meth1(int a,int b) {
	  System.out.println(20);
	  return 10;
  }
  public String meth1(String s) {
	  System.out.println(30);
	  return s;
  }
  protected void meth1(int a,String s) {
	  System.out.println(40);
  }
  private final static void meth1(String s,String y) {
	  int a=10;
	  int b=a--;
	  System.out.println(50);
	  
  }
/* String StringBuffer java.lang.StringBuffer meth1(StringBuffer sb) {
	 System.out.println(60);
	  return sb;
  }*/
 public final static void main(String args[]) {
	  method_overloading obj=new  method_overloading();
	 // obj.meth1(new StringBuffer("java"));
	  obj.meth1();
	  obj.meth1(10);
	  obj.meth1("java is awesome");
	  obj.main();
  }
 public void main() {
	 System.out.println("main method");
 }
 public int main(int a) {
	 System.out.println("main2");
	 return 10;
 }
 
}
