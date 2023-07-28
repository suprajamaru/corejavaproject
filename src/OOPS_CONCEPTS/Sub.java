package OOPS_CONCEPTS;

public class Sub extends Super {
Sub(){
	addValue();
	
}
void addValue() {
	value+=20;
}
public static void main(String[] args) {
	Super b=new Sub();
	System.out.println(b.getValue());
}
}
