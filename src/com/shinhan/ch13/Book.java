package com.shinhan.ch13;

import java.util.Arrays;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = { "titls", "price" }) // 동등비교(기본 주:주소, ㅈ재정의 : 내용)
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book<T> extends Object implements Comparable<Book> {
	private T title;
	private int price;
	private String publisher;
	private String[] author;
	private static int count;
	private final static String COMPANY = "신한출판사";
	
	 public Book() {}

		public Book(T pitle, int price, String publisher, String[] author) {
			super();
			this.title = title;
			this.price = price;
			this.publisher = publisher;
			this.author = author;
			count++;
	}
	
	public static <T> Book<T> makeBook(T title,int price ){//Book앞에 T가 붙는 이유: static으로 올라왔는데 타입설정을 사용하는 놈으로 넘긴다.
//		new book();
		return new Book<> (title, price, " ", new String[] {"김경윤","양유"});
	}
//	@Override
//	public String toString() {
//		return "Book [pitle=" + pitle + ", price=" + price + ", publisher=" + publisher + ", author="
//				+ Arrays.toString(author) + "]";
//	}
//	public String getPitle() {
//		return pitle;
//	}
//	public void setPitle(String pitle) {
//		this.pitle = pitle;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//	public String[] getAuthor() {
//		return author;
//	}
//	public void setAuthor(String[] author) {
//		this.author = author;
//	}
	public static int getCount() {
		return count;	}
//	public static void setCount(int count) {
//		Book.count = count;
//	}
//	public static String getCompany() {
//		return COMPANY;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(pitle, price);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(pitle, other.pitle) && price == other.price;
//	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return price - o.price;
	}

	
}
