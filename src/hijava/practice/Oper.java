package hijava.practice;

public class Oper {

	public static void main(String[] args) {
		int i = 0;
		i += 1; // i = i + 1  <=>  i++
		i *= 10; // i = i * 10
		System.out.println(i);
		
		int k = !(i > 0) ? 100 : 1000;
		System.out.println("k=" + k);
		
		i++; // i = i + 1
		i--; // i = i - 1
		int j = i++;
		System.out.println(i++ + ", j=" + j + "%% " + (i % 2));
	}

}
