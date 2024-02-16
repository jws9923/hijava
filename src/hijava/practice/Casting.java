package hijava.practice;

public class Casting {
	public static void main(String[] args) {
		byte b = 1;
//		char c = 'A';
		int i = 10000000;
		long l = 12345678;
		
		System.out.println(i + l + 10);
		System.out.println(i + l + b + 10);
		
		char j = (char)i;
		System.out.println(j);
		
		System.out.println(Math.pow(2, 3));
	}
}
