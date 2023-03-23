package com.shinhan.day12;

import java.io.File;
import java.util.Date;

public class IOTest {
	public static void main(String[] args)  {
		f11();
	}

	private static void f11() {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		File f = new File(fileName);
		System.out.println(f.exists());
		
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		System.out.println("파일 사이즈"+ f.length());
		System.out.println(f.isFile());
		
	}

	private static void f10() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		
		oos.writeObject(new Account("123", "김", 123));
		oos.writeObject(new Account("123", "김", 123));
		oos.writeObject(new Account("123", "김", 123));
		
		oos.close();
		fw.close();
		
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Account acc1 =  (Account) ois.readObject();
	
		ois.close();
		fi.close();
		
		
	}

	private static void f9() throws IOException, ClassNotFoundException  {
		FileOutputStream fw = new FileOutputStream("serialize.dat");
		ObjectOutputStream oos= new ObjectOutputStream(fw);
		
		oos.writeObject(new Student("김", 100, 12));
		oos.writeObject(new Student("김2", 300, 32));
		oos.writeObject(new Student("김3", 400, 42));
		
		oos.close();
		fw.close();
		
		FileInputStream fi = new FileInputStream("serialize.dat");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Student s1 =  (Student) ois.readObject();
	
		ois.close();
		fi.close();
	}

	private static void f8() throws IOException {
		java.io.FileWriter fw = new java.io.FileWriter("print.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(false);
		pw.print("false");
		pw.write(10);
		pw.write("gd");
		
		pw.close();
		fw.close();
		
	}

	private static void f7() throws Exception {
		OutputStream fw = new FileOutputStream("primitiveData.txt");
		// 자바의 기본타입을 저장하고 그대로 읽고자한다.
		DataOutputStream dos = new DataOutputStream(fw);
		dos.writeInt(200);
		dos.writeInt(522);
		dos.writeBoolean(false);
		dos.close();
		fw.close();

		FileInputStream fr = new FileInputStream("primitiveData.txt");
		DataInputStream dis =new DataInputStream(fr);
		int a = dis.readInt();
		int b = dis.readInt();
		boolean c = dis.readBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		fr.close();

	}

	private static void f6() throws IOException {
		String fileName = "src/com/shinhan/day12/scoredata.txt";
		Path path = Paths.get(fileName);
		int a=0;
		int b=a;
		Files.lines(path).forEach(row -> {
			
			if (b == 0) {
				System.out.println(row.replaceAll("/", "\t") + "\t총점" + "\t평균");
				a++;
			} else {
				System.out.print(row.replaceAll("/", "\t"));

				String[] arr = row.split("/");
				int total = 0;
				for (int i = 1; i < arr.length; i++) {
					try {
						total += Integer.parseInt(arr[i]);
					} catch (NumberFormatException e) {
					}
				}
				System.out.println("\t" + total + "\t" + total / (arr.length - 1));

			}
		});

	}

	private static void f5() throws IOException {
		String path = "src/com/shinhan/day12/scoredata.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String row;
		String title = br.readLine();
		System.out.println(title.replaceAll("/", "\t") + "\t총점" + "\t평균");
		while ((row = br.readLine()) != null) {
			System.out.print(row.replaceAll("/", "\t"));
			String[] arr = row.split("/");
			int total = 0;
			for (int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println("\t" + total + "\t" + total / (arr.length - 1));
		}
		br.close();
		fr.close();
	}

	private static void f4() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		// 1.class기준
		// Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		// 2.절대경로 /로 시작한다.
		// Path path =
		// Paths.get(StreamTest3.class.getResource("/com/shinhan/day11/data.txt").toURI());
		// 3.상대경로는 현재위치를 기준으로한다.
		// 다음은 현재의 절대경로를 얻는다.
//		Path path = Paths.get(""); //1)
//		System.out.println(path.toAbsolutePath());
		// String absolute = System.getProperty("user.dir")+"/data.txt";//2)
		// Path path = Paths.get(absolute);
//		String s = path.toAbsolutePath().toString();
//		path =Paths.get(s+"/data.txt");
//		System.out.println("현재 작업 경로: " + s);
//		System.out.println(Charset.defaultCharset());
	}

	private static void f3() throws FileNotFoundException {
		String path = "src/com/shinhan/dat11/ch17/data.txt";
		FileReader fr = new FileReader(path);
		FileReader fw = new FileReader("Student.java");

		int i;
		while (true) {
			System.out.println((char) i);
		}
		fi.close();
		System.out.println("f2 end");
	}

	private static void f2() throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		path += "src/com/shinhan/dat11/ch17/data.txt";
		FileInputStream fi = new FileInputStream(path);// stread을readfjfRmsek
		InputStreamReader ir = new InputStreamReader(fi);
		int i;
		while ((i = fi.read()) != -1) {
			System.out.println((char) i);
		}
		fi.close();
		System.out.println("f2 end");
	}

	private static void f1() throws IOException {
		// InputStream, OutputStream ,Reader,Writer
		// FileInputSTream,File Output,FileReader,RileWriter
		InputStream is = System.in; // 표준입력 키보드 변경가능
		byte[] arr = new byte[100];
		int i = is.read(arr);
		System.out.println(i + "byte수");
		System.out.println(Arrays.toString(arr));
		for (int a = 0; a < i - 2; a++) {
			System.out.println((char) arr[a]);
		}
	}
}
