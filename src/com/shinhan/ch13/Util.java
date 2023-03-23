package com.shinhan.ch13;

public class Util {

	public static <K,V>V getvalue(pair<K,V> pair, String key) {
		if(pair.getkey().equals(key)) return pair.getValue();
		return null;
	}
	public static <P extends pair<K,V>,K,V>V getvalue2(P pair, String key) {
		if(pair.getkey().equals(key)) return pair.getValue();
		return null;
	}
}
