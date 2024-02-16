package hijava.practice;

public class ForLoop1 {

	public static void main(String[] args) {
		
		// 2 ~ 9 loop
		// 1 ~ 9 loop
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1) continue;
			
			System.out.println(i + " 단 ------- ");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		int line = 6;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= (line - i); j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
