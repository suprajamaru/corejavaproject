package pack2;

public class classa {
int c;
static int e;//e=2
classa() {
	System.out.println(++c);//c=1
	System.out.println(++e);//e=113
}
public static void main(String[] args) {
	int a=34;
	int b=21;
	new classa().c -= a++ + b++;//c=34+21=55,c=-55,a=35,b=22
	int d=--a + --b +new classa().c--;//d=34+21+1=56
	e=a+ +b + +new classa().c +d--;//e=34+21+1+56=112,e=112
	int f=-a + b-- + -new classa().c - d++;//f=-34+21-1-56=-70
	int sum=a+b+ new classa().c +d+e+f; //34+20+1+57+114-70=156
	System.out.println("sum="+sum);
}
}
