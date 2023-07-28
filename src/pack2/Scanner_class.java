package pack2;

import java.util.Scanner;

public class Scanner_class {
	Scanner sc=new Scanner(System.in);
	int per_kg=100;
void meth1() {
	int a=sc.nextInt();
	int b=sc.nextByte();
	int c=a+b;
	System.out.println("c value"+c);
}
void super_market() {
	System.out.println("fruits");
	System.out.println("1)oranges");
	System.out.println("2)apples");
	System.out.println("3)grapes");
	System.out.println("select any fruit number");
	int fruit=sc.nextInt();
	
	switch(fruit)
	{
	case 1:
		System.out.println("oranges 1kg price"+per_kg);
		new  Scanner_class().Price();
		
		break;
	case 2:
		System.out.println("apples 1kg price"+per_kg);
		new  Scanner_class().Price();
		break;
	case 3:
		System.out.println("grapes 1kg price"+per_kg);
		new  Scanner_class().Price();
		break;
		default:
			System.out.println("your not selected any option");
			
	}
	
}
void Price() {
	System.out.println("how many kgs do you want");
	int number_of_kgs=sc.nextInt();
	System.out.println("total amount" +(per_kg* number_of_kgs));	
	System.out.println("you will get 10% discount if your bill is more than 1000 ");
	int Total_bill=per_kg* number_of_kgs;
	int discount=Total_bill*10/100;
	if(Total_bill>=1000){
		System.out.println("Congratulations!!! you will get discount of"+discount);
		System.out.println("your final bill"+(Total_bill- discount));
	}
	else
	{
		System.out.println("you will get 10% if you shop "+(1000- Total_bill)+"rupees");
		System.out.println("select some other fruits to get the discount"); 
		new  Scanner_class().super_market();
	}
	
	
}
public static void main(String[] args) {
	Scanner_class obj=new Scanner_class();
//obj.meth1();
obj.super_market();
}}