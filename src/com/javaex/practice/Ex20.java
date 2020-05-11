package com.javaex.practice;

import java.util.Scanner;
import java.util.Random;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int rd = random.nextInt(100);
		// int s = (int)(Math.random()*100)+1;
		
		System.out.println("=====================\n   [숫자맞추기게임 시작]\n=====================");

		while (true) {
			System.out.println(rd); //숫자 값 보이기
			System.out.print(">>");
			int num = sc.nextInt();

			if (rd > num) {
				System.out.println("더 높게");
			} else if (rd < num) {
				System.out.println("더 낮게");
			} else {
				System.out.print("맞았습니다. \n게임을 종료하시겠습니까?(y/n) >>");
				char yes = sc.next().charAt(0);
				if(yes=='y') {
					rd = random.nextInt(100);
					continue;
			
				}
				else {
					System.out.println("=====================\n   [숫자맞추기게임 종료]\n=====================");
					break;
				}
			}
		}
	}

}
