package pack2;

import java.util.Arrays;
import java.util.Scanner;

public class String_methods {
	Scanner sc=new Scanner(System.in);
void meth1()
{
	String s1="java";
	String s2=new String("java");
	String s3="java";
	String s4=new String("java");
	String s5="html";
	
System.out.println("Equals method");
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s5));
System.out.println(s4.equals(s5));
System.out.println(s4.equals(s3));
System.out.println("jAva".equals(s4));
System.out.println("JAVA".equalsIgnoreCase(s3));
System.out.println("java is awesome".equals(s4.concat(" is awesome")));
System.out.println("please enter string data");
System.out.println(sc.nextLine().equals(s4.concat(sc.next())));

System.out.println("== operator");
System.out.println(s1==s2);
System.out.println(s3==s5);
System.out.println(s4==s5);
System.out.println(s1==s3);
System.out.println(s2==s4);
}
void meth2() {
	System.out.println(" string class methods");
	String s1="java";
	System.out.println("java is awesome".trim().length());
	String s2=s1.concat("is awesome");
	System.out.println(s2);
	System.out.println(s1);
	System.out.println("charAt method");
	System.out.println(s1.charAt(0));
	System.out.println(s2.charAt((s1.indexOf('v'))));
	/*System.out.println("please enter gender M/F");
	char gender=sc.next().toLowerCase().charAt(0);
switch(gender) {
	case 'm':
		System.out.println("USER GIVE GENDER MALE");
		break;b
	case 'f':
		System.out.println("USER GIVE GENDER MALE");
		break;
		default:
			System.out.println("invalid data");
	
	}*/
	String s3="hello supraja";
	System.out.println(s3.startsWith("su"));
	System.out.println(s3.startsWith("hello", 0));
	System.out.println(s3.subSequence(6, (s3.length()-5)));
	System.out.println("hello".startsWith(new String(new char['h'])));
	System.out.println("hello".startsWith(new String(new char[] {'h','e'})));
	System.out.println(s3.toUpperCase());
	System.out.println(s3.substring(2,5));
	System.out.println(s3.substring(3,11));
	System.out.println(s3.replace('a','s'));
	System.out.println(s3.indexOf('h'));
	System.out.println(s3.lastIndexOf('a'));
String s4="abcdef";
byte []b=s4.getBytes();
System.out.println(Arrays.toString(b));
for(byte c:b) {
	System.out.println((char)c);
}

}
public static void main(String[] args) {
	String_methods obj=new String_methods();
	//obj.meth1();
	obj.meth2();
}
}
