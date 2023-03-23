package com.shinhan.ch13;

public class Container<K,V> {
	private K key;
	private V value;
	Container(T data){
	public K getKey() {
		return key;
	}
	public void set(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

	
}
