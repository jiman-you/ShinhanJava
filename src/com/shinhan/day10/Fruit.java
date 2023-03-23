package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of={"name","price"})
public class Fruit implements Comparable<Fruit>{
	String name;
	int price;
	@Override
	public int compareTo(Fruit o) {
		int result1 = name.compareTo(o.name);
		if(result1 == 0)
			return price-o.price;
		return result1;
	}
	
}
