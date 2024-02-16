package hijava.practice;

public class Str {
	public static void main(String[] args) {
		// charTest();
		substrTest();
	}

	private static void substrTest() {
		 String s = "abc-defg";
//		String s = null;
		if (s != null) {
			String s1 = s.substring(4);
			String s2 = s.substring(2, 5);
			String s3 = s.substring(0, s.length() - 4) + "****";

			System.out.println("s1=" + s1);
			System.out.println("s3=" + s3);
		}
		System.out.println("----------------------");
	}

	private static void charTest() {
		char c = '뷐'; // cf. char c = 65; or char c = '\uD55C';
		byte b = 'B';
		System.out.println(c);
		System.out.println((int) c); // cf. (char)c or (char)b
		System.out.println(b);

		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
		System.out.println("한".getBytes().length);
	}
}
