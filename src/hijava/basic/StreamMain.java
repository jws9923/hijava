package hijava.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {
	private static final String FILE = "test.txt";
	public static void main(String[] args) throws IOException {
//		test1();
//		test2();
//		tryThis();
//		test3();
//		test4();
//		test5();
//		test6();
		writeFile("세종대왕 한글 123");
		readFile();
	}
	
	private static final String CHARSET = "UTF-8"; // MS949
	private static void writeFile(String content) {
		File file = new File(FILE);
		try (FileOutputStream fos = new FileOutputStream(file)) {
			OutputStreamWriter osw = new OutputStreamWriter(fos, CHARSET);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(content);
			bw.flush();
			bw.close();
			System.out.println("Write OK : " + 
									file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile() {
		try (FileInputStream fis = new FileInputStream(FILE)) {
			InputStreamReader isr = new InputStreamReader(fis, CHARSET);
			BufferedReader br = new BufferedReader(isr);
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readFile0() {
		try (FileInputStream fis = new FileInputStream(FILE)) {
			int data = 0;
//			byte[] buffer = new byte[10];
			while((data = fis.read()) != -1)
				System.out.println((char)data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeFile0(String content) {
		File file = new File(FILE);
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(content.getBytes());

			System.out.println("Write OK : " + 
									file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	// 좋은 코드!!
	private static void test6() {
		try(FileInputStream fis = new FileInputStream("test.txt")) {
			System.out.println("000000000000000000000");
		} catch (FileNotFoundException e) {
			System.out.println("test.txt파일이 없어요!!");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static void test5() throws IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		fis.close();
	}

	// 개선된 버전
	private static void test4() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("test.txt파일이 없어요!!" + e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void test3() {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("test.txt파일이 없어요!!" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void tryThis() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(90, "홍길동"));
		students.add(new Student(80, "김일수"));
		students.add(new Student(75, "김이수"));
		students.add(new Student(95, "김삼수"));
		
		// 1
		students.forEach(s -> System.out.println("1=" + s.getName()));
		
		// 2
		Student[] arr = new Student[students.size()];
		students.toArray(arr);
		
		int sum = Arrays.stream(arr).mapToInt(s -> s.getId()).sum();
		double avg = Arrays.stream(arr).mapToInt(s -> s.getId()).average().getAsDouble();
		System.out.println("sum = " + sum + ", avg=" + avg);
		
		
		// 3
		Arrays.stream(arr).filter(s -> s.getId() >= 90).sorted().forEach(s -> System.out.println(s));
	}

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2 };
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg=" + avg);
		
		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" + n));
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));
		
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDist=" + n));
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));
		
		System.out.println("---------------");
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));
	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Lim20"));
		students.add(new Student(5, "Lee5"));
		
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s=" + n));
		
		students.stream().mapToInt(s -> s.getId()).sum();
		
		System.out.println(students);
		System.out.println("----------------------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);
	}
}
