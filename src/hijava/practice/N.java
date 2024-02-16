package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	//aaa
	
	public void swap() {
		int t = x;
		x = y;
		y = t;
	}
	
	public void swap2() {
		int x1 = x;
		int y1 = y;
		x = y1;
		y = x1;
	}

	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap2();
		System.out.println("---------------------");
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
	}

}
