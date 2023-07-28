package pack2;

public class cls {


int c;
static int e;//e=2
cls() {
	System.out.println(++c);//c=1
	System.out.println(++e);//e=4
}
public static void main(String[] args) {
	int a=34;
	int b=21;
	System.out.println(new classa().c -= a++ + ++b);//c=34+21=55=-55
	System.out.println(a);
	System.out.println(b);
	int d=--a + --b +new classa().c--;//34+21+1=56
	System.out.println(d);
	e=a+ +b + +new classa().c +d--;//34+21+1+56=112
	System.out.println(e);

}
}


