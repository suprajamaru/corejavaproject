package pack2;

public class ifelse {
	void meth1(int marks)
	{
		if(marks<25)
			System.out.println("Grade is F");
		else if(marks>=25&&marks<45)
			System.out.println("grade is E");
		else if(marks>=45&&marks<50)
			System.out.println("grade is D");
		else if(marks>=50&&marks<60)
			System.out.println("grade is c");
		else if(marks>=60&&marks<80)
			System.out.println("grade is B");
		else if(marks>=80)
			System.out.println("grade is A");
		
		
		
		
		
		
	}
public static void main(String args[] )
{
	new ifelse().meth1(90);
}
}
