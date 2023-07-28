package OOPS_CONCEPTS;

public class task1 {
	void meth1() {
		System.out.println(10);
		System.out.println(this.meth2()+56);//-18+56//38
	}
	
	int meth2(){
		System.out.println(75);
		System.out.println(96);
		return this.meth3();//-18
	}
	int meth3() {
		System.out.println(74);
		System.out.println(92);
		return 74-92;//-18
	}

	void meth4() {
		System.out.println(56);
	}
	task1()
	{
		this(52);
		this.meth1();
		System.out.println(85);
		
	}
	task1(int a)//a=52
	{
		System.out.println(a+7);//59
	}
	
}
