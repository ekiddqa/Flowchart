package com.qa.main;

public class Flowchart {
	static void flowChart1() {
		int A = 100;
		while(A<=200) {
			System.out.println(A);
			A ++;
		}
	}
	static void flowChart2() {
		int A = 100;
		while(A<=200) {
			if(A%2==0) {
				System.out.println("-");
				A ++;
			} else {
				System.out.println("*");
				A ++;
			}
		}
	}
	static void flowChart3() {
		for(int B=1; B <= 10; B++) {
			for(int i=0; i<10; i++) {		
				System.out.println(B);
				}
			}
	}
	static void flowChart4() {
		for(int A=100; A<=200; A++) {
			System.out.println(A);
		}
		for(int Aa=100; Aa<=200; Aa++) {
			if(Aa%2==0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	static void flowChart5(int input) {
		if(input<=10 && input>=1) {
			for(int i=0; i<input; i ++) {
				System.out.println(input);
			}
		}
		
	}
}
