package com.sesung.util.random;

import java.util.Random;

public class RandomEx1 {

	public void ex4() {
		//RPG
		//10% 확률로 2단계 성공, 20%확률로 1단계 성공, 70% 확률로 실패
		Random rd = new Random();
		int [] gh = {1,2,4,3,9,15,21,27,33,39};
		int a = rd.nextInt(gh.length);
		int aa=gh[a];
		if((aa%3)==0) {
			System.out.println("실패");
		}else if((aa%2)==0) {
			System.out.println("1단계 성공");
		}else {
			System.out.println("2단계 성공");
		}
		//		Random rd = new Random();
		//		int [] gh = {0,0,0,0,0,0,0,1,1,2};
		//		int a = rd.nextInt(gh.length);
		//		int g =gh[a];
		//		if(g==0) {
		//			System.out.println("실패");
		//		}else if(g==1) {
		//			System.out.println("1단계 성공");
		//		}else {
		//			System.out.println("2단계 성공");
		//		}
	}

	public void ex3() {
		//랜덤하게 하나 프린트
		String [] foods = {"떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기"};
		Random rd = new Random();
		int i =rd.nextInt(6);
		System.out.println(foods[i]);

	}

	public void ex2() {
		//1~45까지의 숫자 6개
		int [] lotto = new int [6];
		Random rd = new Random();
		for(int i =0; i<lotto.length; i++) {
			lotto[i]= rd.nextInt(45)+1;
			for(int j=0;j<i; j++) {//j는 앞에 이는 인덱스번호 i는 현재 뽑은 인덱스 번호
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}

	public void ex1() {
		//6개의 숫자가 출력
		//1~45 랜덤하게
		Random rd = new Random();
		for(int i =0; i<6; i++) {
			int a = rd.nextInt(45)+1;
			System.out.print(a+"\t");
		}
	}

}
