package com.shinhan.ch15_exm;

public class 유지만15ex {
//---1번 4
//---2번 3
//---3번 4	
//---4번 3	
//---5번
	List<Board> 변수 = new ArrayList<>();
//
//---6번
	Map<String,Integer> 변수 = new HashMap<>();
//	
//---7번	
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
//	
//	---8번
	import java.util.Objects;

	public class Student {
		public int studentNum;
		public String name;
		
		public Student(int studentNum, String name) {
			super();
			this.studentNum = studentNum;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(studentNum);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(studentNum, other.studentNum);
		}
		
	}
//	---9번
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;

import com.shinhan.day10.Board;

	public class MapExample {
		public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<>();
			map.put("blue", 96);
			map.put("hong", 86);
			map.put("white", 92);
			
			String name =null;//최고점수아이디
			int maxScore = 0;//최고점수
			int totalScore = 0;//점수합계
			
			for(Entry<String, Integer> ma:map.entrySet()) {
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
//	---10번
	public class Student implements Comparable<Student>{
		public String id;
		public String score;
		
		public Student(String id,String score) {
			this.id=id;
			this.score=score;
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
//	
//	
//	
//	
//	
//	
}
