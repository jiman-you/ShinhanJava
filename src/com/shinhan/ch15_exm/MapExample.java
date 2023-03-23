package com.shinhan.ch15_exm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name =null;//최고점수아이디
		int maxScore = 0;//최고점수
		int totalScore = 0;//점수합계
		
		for(String Key :map.keySet()) {
			if(maxScore<ma.getValue()) {
				name = ma.getKey();
				maxScore = ma.getValue();
			}
			totalScore+=ma.getValue();
		}
		System.out.println("평균점수:"+(totalScore/map.size()));
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고아이디:"+name);
	}
}
