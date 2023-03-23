package com.shinhan.Ch11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("file.txt");
			fw.write("java");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

