package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print ("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		

		for(int i=1; i<=num; i++) {
			if(i==num) {
				System.out.println(i);
			}
			else {
				System.out.print(i+"+");
			}
			sum += i;
		}
		System.out.println("합계: " + sum);
	
		
	}

}
