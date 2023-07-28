package pack2;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
	void meth1() {
		int arr1[];
		arr1=new int[5];
		int arr2[]=new int[4];
		int arr3[]=new int[]{10,30,40,50};
		int arr4[]= {11,22,33};
		String s="supraja";
		System.out.println("String length"+s.length());
		System.out.println("arr1 length:"+arr1.length);
		System.out.println("arr2 length:"+arr2.length);
	System.out.println("arr3 length:"+arr3.length);
	System.out.println("arr4 length:"+arr4.length);
System.out.println("--------");
System.out.println("oth index of arr1[]"+arr1[0]);

System.out.println("last index position of arr2"+arr2[3]);

System.out.println("last index position of arr3"+arr3[arr3.length-1]);
System.out.println("---------");
arr1[1]=20;
arr1[2]=52;
System.out.println("arr1[]"+Arrays.toString(arr1));
System.out.println("arr2"+Arrays.toString(arr2));
System.out.println("arr3"+Arrays.toString(arr3));
System.out.println("arr4"+Arrays.toString(arr4));
System.out.println("----------");
}

void meth2() {
	Scanner sc=new Scanner(System.in);
	System.out.println("how may tickets you need?");
	String names[]=new String[sc.nextInt()];
	
	System.out.println("enter"+names.length+"candidate names");
	for(int i=0;i<names.length;i++) {
		//for(int j=o;j,=names.length;j++) {
			
		
		names[i]=sc.next();
		System.out.println("");
		System.out.println();
		
	}
	System.out.println("your tickets booked for");
	System.out.println(Arrays.toString(names));
	System.out.println("select seats");
	
	for(int i=0;i<=names.length;i++)
	{
		System.out.println(names[i]+" "+(sc.next()));
	}
	sc.close();
	

	
}
public static void main(String[] args) {
	practice obj=new practice();
	//obj.meth1();
	obj.meth2();
}
}