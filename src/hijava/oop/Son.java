package hijava.oop;

public class Son extends Mom {
	public Son() {
		super("아들");
	}
	
	public Son(String name) {
		super(name);
	}
	
	public void say() {
		System.out.println("Son said...");
	}
	
	public void ttt() {
		System.out.println("TTT");
	}

	public void drinkMilk() {
		System.out.println("Drinking Milk!!");
	}
}
