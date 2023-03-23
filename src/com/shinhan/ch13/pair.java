package com.shinhan.ch13;

public class pair<K, V> {
	private K key;
	private V value;
	
	public pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public K getkey() {return key;}
	public V getValue() {return value;}
}
