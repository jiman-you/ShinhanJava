package com.shinhan.day10;

import javax.security.auth.Subject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"Subject","writer"})
public class Board implements Comparable<Board>{
	private int boardNo;
	private String subject;
	private String content;
	private String writer;

	public Board(int boardNo, String subject, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public int compareTo(Board board) {
		int result1 = subject.compareTo(board.subject);
	
		if(result1==0) {
			int result2 = writer.compareTo(board.writer);
			if(result2==0) return boardNo - board.boardNo;
			return result2;
		}
	
		
		return result1;
	}
	
	
	
	
	
		
}
