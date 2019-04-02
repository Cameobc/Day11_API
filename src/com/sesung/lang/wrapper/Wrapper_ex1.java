package com.sesung.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex2() {
		//비밀번호를 입력하세요.
		//대문자 한 개이상, 소문자 한 개이상, 공백은 없어야하고, 숫자 한 개 이상의 조합. 최소 6자 이상.
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력해주세요.");
		String pw = sc.nextLine();
		int so = 0;
		int da = 0;
		int num = 0;
		int space =0;
		int count = 0;  // 문자 길이

		count = pw.length();
		if(count>5) {	//COUNT로 범위를 우선 설정하고 들어갔음. 나는 따로 돌려서 합치려고 했는데 이따가 한번 해보기.
			for(int i =0; i<count;i++) {
				char ch = pw.charAt(i);
				if(Character.isUpperCase(ch)) {
					da++;
				}else if(Character.isLowerCase(ch)) {
					so++;
				}else if(Character.isDigit(ch)) {
					num++;
				}else if(Character.isWhitespace(ch)){
					space++;
				}else{
					break;
				}
			}
			if(so!=0 && da!=0 && num!=0 && space==0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("대문자, 소문자, 숫자를 각각 1개 이상 포함해 주세요.");
			}
		}else {
			System.out.println("최소 6글자 이상으로 맞춰주세요.");
		}
	}




	public void ex1() {
		//주민번호 입력받기
		//1. 나이가 몇인지  99=20, 01=18 현재년도-태어난년도
		//2. 3~5 : 봄 , 6~8 : 여름. 9~11 : 가을, 12~2 : 겨울		
		Scanner sc = new Scanner(System.in);
		int result =0;
		System.out.println("주민번호 입력");
		String num = sc.next();
		String year = num.substring(0,2);
		int yea = Integer.parseInt(year);
		String nn = num.substring(7, 8);
		int ye = Integer.parseInt(nn.trim());

		if(ye==1 || ye ==2) {
			result = 2019-(yea+1900);
		}else {
			result = 2019-(yea+2000);
		}
		System.out.println("Age : "+result);
		String sea = num.substring(2, 4);
		int se = Integer.parseInt(sea);
		if(se>=3 && 5>=se) {
			System.out.println("봄");
		}else if(se>=6 && se<=8) {
			System.out.println("여름");
		}else if(se>=9 && se<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}



	}

}
