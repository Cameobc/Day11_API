package com.sesung.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {
	
	public void ex2() {
		//1번 
	}

	public void ex1() {
		//숫자를 입력 받아서 해당 숫자만큼 랜덤한 숫자를 생성
		//리스트에 추가하고 출력
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		ArrayList ar = new ArrayList();
		System.out.println("숫자를 입력해주세요.");
		int count = sc.nextInt();

		for(int i=0;i<count;i++) {
			int num = random.nextInt();
			ar.add(num);
		}
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}