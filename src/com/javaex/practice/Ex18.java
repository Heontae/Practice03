package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for (int j = i; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < star; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
