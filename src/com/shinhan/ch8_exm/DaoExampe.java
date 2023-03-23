package com.shinhan.ch8_exm;

public class DaoExampe {
	
	public static void dbWork(dataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new oracleDao());
		dbWork(new MysqlDao());
	}

}
