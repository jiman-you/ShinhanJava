package com.shinhan.ch8_exm;

public class MysqlDao implements dataAccessObject {

	@Override
	public void select() {
		System.out.println(getClass().getSimpleName()+"에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName()+"에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName()+"에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName()+"에서 삭제");

	}

}
