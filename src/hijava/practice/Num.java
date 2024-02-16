package hijava.practice;

public class Num {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		
		int i = 2147483647;
		long l = 2147483648L;
		
		float f = 0.1f;
		double d = 123.45;
		
		System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}
