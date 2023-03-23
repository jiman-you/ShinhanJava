package com.shinhan.day12;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Student implements Serializable {
	private String name;
	private int engScore;
	private int mathScore;
	
}
