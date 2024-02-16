package hijava.basic;

import java.util.ArrayList;
import java.util.List;

public class StackQueue {
	final static String[] strs = new String[] { "aaa", "bbb", "ccc" };

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		
		pushStack_enQueue(lst);
		System.out.println(lst);
		
//		pop(lst, 2);
		dequeue(lst, 2);
		
		System.out.println("-------------------------");
		System.out.println(lst);
	}
	
	private static void dequeue(List<String> lst, int cnt) {
		for (int i = 0; i < cnt; i++) {
			String dequeueValue = lst.remove(0); 
			System.out.println(i + " - dequeueValue=" + dequeueValue);
		}
	}

	private static void pop(List<String> lst, int cnt) {
		for (int i = 0; i < cnt; i++) {
			String popValue = lst.remove(lst.size() - 1); 
			System.out.println(i + " - popValue=" + popValue);
		}
	}

	private static void pushStack_enQueue(List<String> lst) {
		for (int i = 0; i < strs.length; i++) {
			lst.add(strs[i]);
		}
		
	}

}
