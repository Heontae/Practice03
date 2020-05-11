package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;

		
		for(int i=num;i>0; i=i-2) {
			sum = sum + i;
			
		}
		System.out.println(sum);
	}

}
