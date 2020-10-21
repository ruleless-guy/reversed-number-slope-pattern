package com.asg.app;

public class Main {

	public static void main(String[] args) {
		
		int num = 124;
		int digitCount = String.valueOf(num).length();
		
		for(int i = num; i >=1; i--) {
			
			for(int j = 1; j<=num; j++) {
				
				if(j < i) {
					System.out.printf("%"+digitCount+"s"," ");
				}
				else {
					System.out.printf("%"+digitCount+"d",j);
				}
				
				if(j!=num) {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}
