package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCalculator {
	void addCalculator(String inputFileName) throws IOException {
		//FileInputStream,FileReader
		//보조Stream이용: BufferedReader,DataInputStream
		
		FileReader fi = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fi);
		
		String s;
		int sum=0;
		int mul=1;
		while((s=br.readLine())!=null) {
			sum+=Integer.parseInt(s);
			mul*=Integer.parseInt(s);
		}
		
		br.close();
		fi.close();
	
		FileWriter fw = new FileWriter(inputFileName,true);//appen여부
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write(sum+"");
		bw.newLine();
		bw.write(mul+"");
	
		bw.close();fw.close();
	}
		
		
	}

