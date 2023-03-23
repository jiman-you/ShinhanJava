package com.shinhan.ch15_exm;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> boardlist = new ArrayList<>();
	
	public List<Board> getBoardList() {
	boardlist.add(new Board("제목1", "내용1"));
	boardlist.add(new Board("제목2", "내용2"));
	boardlist.add(new Board("제목3", "내용3"));
		return boardlist;
	}

}
