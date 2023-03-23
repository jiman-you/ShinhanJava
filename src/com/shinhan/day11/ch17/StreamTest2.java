package com.shinhan.day11.ch17;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day09.Account;

public class StreamTest2 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		f14();

	}
	private static void f14() {
		// collection - 다시묶기
		List<Student2> data = new ArrayList<>();
		data.add(new Student2("김혁수", 98, "남"));
		data.add(new Student2("박혁선", 44, "남"));
		data.add(new Student2("김진아", 96, "여"));
		data.add(new Student2("최수진", 13, "여"));
		data.add(new Student2("정예찬", 74, "남"));
		data.add(new Student2("오현민", 35, "남"));
		
		//group으로 집계를 하고 다시 group을 collection으로 만든다.
		Map<String,Double> map = data.stream().collect(//남여 나눠서 평균을냄
				Collectors.groupingBy(st->st.getGender(),
						Collectors.averagingDouble(st->st.getScore()))
				);
		System.out.println(map);
		
	}
	private static void f13() {
		// 요소조건만족여부
		int[] arr = {2,4,3,6,5};
	   boolean boo = Arrays.stream(arr).allMatch(num->num%2==0);//모든 요소가 만족
		System.out.println(boo);

		boolean boo2 = Arrays.stream(arr).anyMatch(num->num%2==0);//어떤 요소라도 만족
			System.out.println(boo2);
			
		boolean boo3 = Arrays.stream(arr).noneMatch(num->num%2==0);//전부 만족하지 않음
		System.out.println(boo3);
		
		double d =  Arrays.stream(arr)
				.filter(num->num%2==0)
				.average()
				.orElse(0);//값이 없으면 디폴트로 0을 넣어라.
//				.getAsDouble();
		System.out.println(d);
	
	}
	private static void f12() {
		// 
		List<Student> data = Arrays.asList(
				new Student("홍길동1", 10),	
				new Student("길동홍2", 50),	
				new Student("동길홍3", 30),
				new Student("동길홍5", 70),
				new Student("동길홍4", 10)
					);
		data.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("====sort이름순으로변경====");
		data.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(s->System.out.println(s));
		
	}
	private static void f11() {
		//compare비교
		int[] arr = {100,20,34,06,34};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr, (a,b)->b-a);
//		System.out.println(Arrays.toString(arr));

		Student[] arr2 = {
				new Student("김", 30),new Student("김", 50),new Student("김", 20),
				new Student("박", 30),new Student("김", 80),new Student("김", 90)
		};
		Arrays.sort(arr2);//점수순 점수같으면이름
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a,b) -> a.getName().compareTo(b.getName()));//이름순 
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
	private static void f10() {
		//flatMap
		List<String> data = new ArrayList<>();
		data.add("this is java");
		data.add("i am a best developer");
		data.stream()
		.flatMap(d->Arrays.stream(d.split("")))//data를 " "로 스플릿 해서 새로운 Arrays.stream을 만들어라
		.forEach(word->System.out.println(word));
		
		List<String> data2 = Arrays.asList("10","80","20","50","40");//asList는 Arrays의 정적메소드로 값 수정 불가
		data2.stream()
		.flatMapToInt(d->{
			String[] arr = d.split(",");
			int[] intarr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				intarr[i] = Integer.parseInt(arr[i].trim());
			}return Arrays.stream(intarr);	
		})
		.forEach(num->System.out.println(num));
		
	}
	private static void f9() {
		// 기본형을boxed
		int[] arr = {10,20,30,40,50};
		Arrays.stream(arr).asDoubleStream().forEach(s->System.err.println(s));//인트객체배열을 더블형으로 바꿈
		
		Arrays.stream(arr).boxed().forEach(d->System.out.println(d.floatValue()));
		
	}
	private static void f8() {
		//필터링연습
		//distinct():중복제거
		//filter(): 트루인것만 리턴
		List<Student> data = Arrays.asList(
				new Student("홍길동1", 10),	
				new Student("길동홍2", 50),	
				new Student("동길홍3", 30),
				new Student("동길홍4", 70),
				new Student("동길홍5", 80)
					);
		
		data.stream()
		.distinct()
		.filter(s->s.getScore()>=70)//스코어가 70이상인것만 나와라
		.forEach(s->System.out.println(s));
		
		System.out.println("+=++=+++++");
		
		data.stream()
		.distinct()
		.filter(s->s.getName().startsWith("동"))//성이 동인것만나와라
		.forEach(s->System.out.println(s));

		System.out.println("+=++동씨 점수 평균+++");
		
		data.stream()
		.distinct()
		.filter(s->s.getName().startsWith("동"))//성이 동인것만나와라
		.mapToInt(s->s.getScore())
		.average()
		.ifPresentOrElse(a->System.out.println("평균:"+a), ()->System.out.println("계산안됨"));
	}
	private static void f7() {
		//필터링연습
		//distinct():중복제거
		//filter(): 트루인것만 리턴
		List<String> data = new ArrayList<>();
		data.add("홍길동1");		data.add("홍길동36");		data.add("홍길동5");		data.add("홍길동6");
		data.add("홍길동2");		data.add("홍길동46");		data.add("홍길동5");		data.add("홍길동6");

		data.stream()
		.distinct()
		.filter(s->s.endsWith("6"))//endsWith ~문자로 끝나는 것
		.forEach(s->System.out.println(s));
	}

	private static void f6() throws URISyntaxException, IOException {
		// 파일 스트림 이용해서 읽기
		Path path  = Paths.get(StreamTest2.class.getResource("data.txt").toURI());
		System.out.println(path);
		System.out.println(Charset.defaultCharset());//UTF-8 ; 3바이트씩?
		Stream<String> streamData =  Files.lines(path,Charset.defaultCharset());
		//파일패스를 얻어 UTF-8형식으로 파일은 한줄씩 읽어 스트림으로 만든다.
		streamData.forEach(line->System.out.println(line));
		
	}

	private static void f5() throws IOException {
		//파일 읽기
		FileInputStream fi = new FileInputStream("src/com/shinhan/day11/ch17/data.txt");
		int i;
		while((i=fi.read())!=-1) {
			System.out.println((char)i);
		}
		
	}

	private static void f4() {
		//숫자 범위로부터 스트림얻기 rande()~~rangeClosed()
		IntStream.range(1, 10).forEach(su->{
			System.out.println(su);
		});//이상미만
		IntStream.rangeClosed(1, 10).forEach(su->System.out.println(su));//이상이하
		//외부반복자
		for(int i = 1; i<10;i++) {
			System.out.println(i);
		}
		
	}

	private static void f3() {
		List<Account> data = new LinkedList<>();
		data.add(new Account("123", "홍6", 1000));
		data.add(new Account("122", "홍1", 2000));
		data.add(new Account("121", "홍7", 3000));
		data.add(new Account("124", "홍2", 4000));
		data.add(new Account("125", "홍3", 5000));
		data.add(new Account("126", "홍5", 6000));
		
		//모든 게좌의 잔고의 합을 출력하기...외부 반복자를 이용
		int total = 0;
		for(Account acc : data) {
			total+= acc.getBalance();
			
		}
		System.out.println("잔고의 합계:"+total);
		
		//Stream을 이용한 내부반복자
		long result= data.stream().mapToInt(acc -> acc.getBalance()).sum();
		System.out.println("Acount balace합계:"+result);
		
		result = data.stream().map(acc->acc.getOwner()).count();
		System.out.println("건수는"+ result);
		
		data.parallelStream()
		.map(acc->acc.getOwner())
		.forEachOrdered(owner->System.out.println(owner+"ㅇㅖ금주님"));//순서를 보장
//		.forEach(owner->System.out.println(owner+"ㅇㅖ금주님"));//순서보장안함
	}

	private static void f2() {
		// 여러건 저장하기: 배열 , Collection(List,Set,Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("김2", 120));
		data.add(new Student("김3", 320));
		data.add(new Student("김4", 140));
		data.add(new Student("김5", 1640));
		data.add(new Student("김6", 10));
		
		//data를 Stream으로 만들어서 중간처리,최종처리
		data.stream().forEach(st->{
			System.out.println(st);
			System.out.println(st.getName()+"==>"+st.getScore());
		});//List중 한 건을 받는거기때문에 
		System.out.println("======중간처리======");
		data.stream().mapToInt(st->st.getScore()).forEach(score->{
			System.out.println(score);
			System.out.println("---------------:");
		});;
		
		System.out.println("======최종처리======");
		double d = data.stream().mapToInt(st->st.getScore()).average().getAsDouble();
		System.out.println(d);
		
		System.out.println("======Optional Test======");
		OptionalDouble option = data.stream().mapToInt(st->st.getScore()).average();
		option.ifPresent(avg -> System.out.println(avg));
		System.out.println(d);

		System.out.println("======Optional Test2======");
		 data.stream().mapToInt(st->st.getScore()).average().ifPresent(avg->System.out.println(avg));

//		 System.out.println("======Optional Test3======");
//		 data.stream().mapToInt(st->st.getScore()).average().ifPresentOrElse(d->{System.out.println(d);},()-> System.out.println("평균계산실패"));
	}

	private static void f1() {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 10),	
			new Student("길동홍", 50),	
			new Student("동길홍", 30)
				);
		//mapToInt:중간처리 
		//map변형한다 인트형태로
		//average():최종처리 평균구하기
		
		double avg= list.stream().mapToInt(st->st.getScore()).average().getAsDouble();
		System.out.println(avg);
		
		OptionalDouble opAvg= list.stream().mapToInt(st->st.getScore()).average();
		opAvg.ifPresentOrElse(a->{
			System.out.println("평균:"+a);
		}, ()->{
			System.out.println("평균계산불가");
		});//옵션이 있으면~ 없으면~
	
	}

}
