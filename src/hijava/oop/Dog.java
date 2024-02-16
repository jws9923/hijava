package hijava.oop;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("BowWow!");
	}
	
	public static void eat(String food) {
		System.out.println("Dog eat " + food);
	}
	
	@Override
	public String toString() {
		return "This is Dog";
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);
		
		String s = "Test: " + d;
		System.out.println(s);
	}
}
