package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author Jade
 * @update say함수 추가 (2019-01-12 by QQQ)
 */

public class HelloJava {
	String message = "Hello World";
	
	public static void main(String[] args) {

		// HelloJava에게 say라는 명령을 내림!
		HelloJava.say("Hi~");
		
		// JVM이 스스로 화면에 출력
		System.out.println("Hello Java!!");
		char a = '뷐';
		System.out.println((int)a);
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
