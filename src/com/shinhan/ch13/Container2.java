package com.shinhan.ch13;

import lombok.Getter;

@Getter
public class Container2<K,V> {
	private K key;
	private V value;
	
	public <K, V> Container2(K key2, V value2) {
		this.key = key2;
		this.value = value2;
	}
	public void set(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
