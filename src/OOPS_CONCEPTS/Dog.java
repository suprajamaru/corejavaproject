package OOPS_CONCEPTS;

public class Dog extends Animal {
void PrintName() {
	System.out.println("Dog");
}
Dog(){
	
}
public static void main(String[] args) {
	Animal a=new Dog();
	a.PrintName();
}
}

