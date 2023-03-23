package com.shinhan.ch12;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
	public static void main(String[] args) {
		f4();
	}

	private static void f4() {
		Car[] arr = {new Car("A",4000),new Car("C",200),new Car("D",47000)};
		print("before",arr);
		Arrays.sort(arr);
		print("가격asc,모델desc after",arr);

		Arrays.sort(arr,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				int result = o2.price-o1.price;
				if(result == 0) {
						return o1.model.compareTo(o2.model);
				}
				return result;
			}
		});
		print("가격desc,모델asc after",arr);
	
		
	}

	private static void print(String string, Car[] arr) {
		System.out.println("========="+string+"=========");
		for(Car car:arr) {
			System.out.println(car);
		}
		
	}

	private static void f1() {
		int[] arr = new int[] {100,30,20,50,60};
		System.out.println("before:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after:"+Arrays.toString(arr));
		
	}
	private static void f2() {
		String[] arr = {"Spring","Java","jsp","servlet","html","CSS","React"};
		System.out.println("before:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after:"+Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {
		

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("desc:"+Arrays.toString(arr));
		
	}
	private static void f3() {
		Money[] arr = {new Money(10),new Money(8),new Money(6),new Money(5),new Money(3)};
		System.out.println("before:"+Arrays.toString(arr));
		Arrays.sort(arr);//Comparable인터페이스를 구현하지 않으면 비교불가.
		System.out.println("ascafter:"+Arrays.toString(arr));
		
		
		Arrays.sort(arr, new Comparator<Money>() {

			@Override
			public int compare(Money o1, Money o2) {
				
				return o2.compareTo(o1);
			}
		});//Comparable인터페이스를 익명구현.
		System.out.println("descafter:"+Arrays.toString(arr));
		
	}
}
