package OOPS_CONCEPTS;

public class Lion extends Abstract{
	
	public void Animal_Sound() {
		System.out.println("lion roaring");
	}

	@Override
	public void Animal_legs() {
		System.out.println("lion is having 4 legs");
		
	}
	public static void main(String[] args) {
	Abstract l=new Lion();
		l.Animal_Sound();
		l.Animal_Sleep();
		l.Animal_legs();
	}

}
