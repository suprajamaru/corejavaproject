package pack2;

public class block {
	
static int a=0;
int b=0;
block()
{
	a++;
	b++;
	System.out.println("stsatic variable"+a);
	System.out.println("instance variable:"+b);
	System.out.println("------");
	}
void display() {
	System.out.println("***accesing static variables***");
	System.out.println(block.a);
	System.out.println(a);
	System.out.println(new block().a);
	}
}
					