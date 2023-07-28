package pack2;

public class While {
void meth1()
{
	int i=10;
	while(i<=10) 
		System.out.println("i value" + i++);
		i++;
	
}
void meth2()
{
	for(int i=1;i<=5;++i)
	
		System.out.println("i value"+(i++ + ++i));
	
	
	System.out.println("meth2 ");
}
	
public static void main(String [] args)
{
	While obj=new While();
	obj.meth2();
	
}
}

