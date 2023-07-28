package OOPS_CONCEPTS;

public interface InterfaceA {
	void GreenTea();
	void TeaPowder();
	int Soaps();
	private void meth1() {
		
	}

	static void meth2() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		System.out.println("main called");
		InterfaceA.meth2();
	}
	}


