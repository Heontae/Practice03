package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int sum = 0;
		boolean result = true;

		do {
			System.out.println("-------------------------\n1.예금 | 2.출금 | 3.잔고 |4.종료\n-------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();

//			if(num==4) {
//				System.out.println("프로그램종료");
//				break;
//			}

			switch (num) {
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				sum += money;
				break;

			case 2:
				System.out.print("출금액>");
				money = sc.nextInt();
				sum -= money;
				break;

			case 3:
				System.out.println("잔고액>" + sum);
				break;

			case 4:
				System.out.println("프로그램종료");
				result = false;
				break;

			default:
				System.out.println("다시입력해주세요");
				break;
			}

		} while (result);

	}

}
