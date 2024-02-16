package hijava.basic;

import hijava.practice.Man;

public class Person<T> {
	private T person;

	public void set(T person) {
		this.person = person;
	}

	public String getName() {
		return this.person.toString();
	}
	
	public static void main(String[] args) {
		Man m = new Man("Man");
		Student stu = new Student(100, "Hong");
		
		Person<Man> mp = new Person<>();
		mp.set(m);
		System.out.println("m=" + mp.getName());
		Person<Student> sp = new Person<>();
		sp.set(stu);
		System.out.println("s=" + sp.getName());
	}
}
