package control_statements;

public class task1 {
void meth1(int a,int b,int c) {

	while(a<=5) {
    if(b<=10) {
    while(c<=5)	
	{
	System.out.println("c value"+c);
	++c;
			System.out.println("-------");
		}
		}
		else {
			
			do {
				System.out.println("a value"+a);
				++a;
				
			}
			while(a>=5);
			System.out.println();
		}
	System.out.println("a value is "+a);
	a++;
	}
		System.out.println("meth1 executed");
	}
void meth2() {
	int i =1;
	do {
		System.out.println("i value"+i);
		i++;
	}
	while(true);
}
void meth3() {
	int i=5;
	while(i<=5) {
		System.out.println(++i);
	}
}

public static void main(String[] args) {
	new task1().meth1(10,5,5);
	task1 obj=new task1();
	obj.meth2();
}
}
