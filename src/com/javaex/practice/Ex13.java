package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		

		for(int i=num; i>=1; i--) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	
		
	}

}
