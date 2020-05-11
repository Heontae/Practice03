package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int[] num = new int[5];
		//길이가 5인 배열 생성
		
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			num[i] = sc.nextInt();
			
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		
	}

}
