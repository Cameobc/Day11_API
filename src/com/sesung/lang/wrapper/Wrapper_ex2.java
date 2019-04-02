package com.sesung.lang.wrapper;

import java.util.Scanner;


public class Wrapper_ex2 {

	public void ex1() {
		//주민번호받기 -> 실존하는 번호인지 판별하기
		//마지막 번호는 체크용 번호로 따로 저장.
		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7  // 13자리. 13번은 저장용, 6은 - 임.
		//*2 3 4 5 6 7   8 9 2 3 4 5
		//18 +12 +4 +10 ...
		//결과를 11로 나눈 나머지를 구하기
		//나머지를 11로 뺀 값을 체크용 번호랑 비교해서 같으면 정상적인 주민번호, 다르면 wrong number
		//if 11-나머지  = 두 자리라면 결과값을 10으로 나눈 나머지를 체크 번호랑 비교

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");
		String num = sc.next();
		String num1 = num.replaceAll("-", "");
		String last = num1.substring(12, 13);
		int las = Integer.parseInt(last);
		int number = 0;
		int hap =0;
		int count=2;
		for(int i =0; i<num1.length()-1;i++) {
			String one = num1.substring(i, i+1);
			number = Integer.parseInt(one);
			hap=count*number+hap;
			count++;
			if(count>9) {
				count=2;
			}
		}//for end
		int result = 11-(hap%11);
		if(result<10 &&  result==las) {
			System.out.println("정상");
		}else if(result>9 && (result%10)==las){
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	}
}
