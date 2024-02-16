package hijava.practice;

public class Sum100 {
	public static void main(String[] args) {
//		sumByWhile();
		sumByFor();
	}

	private static void sumByFor() {
		int total = 0;
		for (int i = 100; i > 0; i-- ) {
			System.out.println("i=" + i);
			total = total + i;
		}
		System.out.println("Result2 is " + total);
	}

	private static void sumByWhile() {
		int i = 0;
		int total = 0;
		
		while(++i <= 100) {
			if (i % 2 == 0)	continue;
			
			total = total + i;
		}
		
		System.out.println("Result is " + total);
	}
}
