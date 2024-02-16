package hijava.oop;

public abstract class AbstChild2 extends AbstSuper {
	@Override
	public int max(int i, int j) {
		return i > j ? i + 100 : j + 1000;
	}
}
 