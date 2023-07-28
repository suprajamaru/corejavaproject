package OOPS_CONCEPTS;

public class OopsExam4 {
static String value="abc";
public static void changevalue(String a) {
String data=a.concat(value);
System.out.println("data"+data);
data=value;
}
public static void main(String[] args) {
	value="java";
	changevalue(value);
	System.out.println(value);
	
}
}
