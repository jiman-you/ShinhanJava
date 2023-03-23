package com.shinhan.Ch11;

public class exm5 {

	public static void main(String[] args) {
		
	}

		public void method1() throws NumberFormatException,ClassNotFoundException{
			try {
				method1();
			}catch(Exception e) {
				
			}
			
			try {
				method1();
			}catch(Exception e) {
				
			}catch(ClassNotFoundException e) {
				
			}
			
			try {
				method1();
			}catch(ClassNotFoundException e) {
				
			}catch(NumberFormatException e) {
				
			}
		}
		void method2() throws Exception {
			method1();
		}
}
