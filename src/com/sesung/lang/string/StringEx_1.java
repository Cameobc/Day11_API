package com.sesung.lang.string;

import java.util.Scanner;

public class StringEx_1 {
	Scanner sc = new Scanner(System.in);

	//ex1 return void로
	//주민등록번호 입력받아서 남자인지 여자인지 구별하기.  // 8번째 자리수임

	public void ex1() {
		System.out.println("주민등록 번호를 입력하세요.");
		String nums = sc.next();
		char su = nums.charAt(7);
		if(su =='1' || su == '3' || su == '5') { // if(su =='1' || su == '3' || su == '5')if((su%2)!=0)
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
	}

	public void ex2() {
		String name = "Mississippi";
		//i글자가 몇개 있습니까?
		int i =-1;  //index 번호를 담으려고 함
		int count =0;
		while(true) {
			i =name.indexOf("s", i+1);
			if(i != -1) {  //count를 담는 부분
				count++;
			}else {
				break;
			}
		} // while end
		System.out.println(count);
	}

	public void ex3() {
		//문자열을 입력받기 한글자당 100원 입력받은 문자가 총 얼마인지.
		System.out.println("전보 입력");
		String letter = sc.next();
		int cost = letter.length();
		System.out.println("가격은 "+cost*100+"원 입니다.");
	}

	public void ex4() {
		//id 입력 - 이메일 형식, @가 들어가도록/ 최대 10글자 이하로만 10글자가 넘어가면 다시 입력하세요 출력
		boolean check1 = false;  // 길이가 맞는지 여부
		boolean check2 = false; //이메일형식여부 판별
		System.out.println("ID를 입력하세요.");
		String id = sc.next();

		if(id.length()<11) {
			check1=true;
		}
		int index = id.indexOf("@");
		if(index!=-1) {
			check2=true;
		}
		if(check1 && check2) {
			System.out.println("사용 가능한 아이디");
		}else {
			System.out.println("10글자 이하, 이메일 형식을 지켜주세요.");
		}
	}


	public void ex5() {
		//jpg, png, gif
		//업로드 할 파일명 입력->이미지 파일인지 아닌지 구별. 아닐 시엔 이미지 파일을 올려주세요. 출력 

		System.out.println("업로드 할 파일명을 입력해주세요.");
		String name = sc.next();
		int point = name.lastIndexOf(".");
		String rr = name.substring(point+1) ;
		if(rr.equals("jpg") || rr.equals("png") || rr.equals("gif")) {
			System.out.println("확장자명 : "+rr);
			System.out.println("업로드 성공");
		} else{
			System.out.println("이미지 파일을 올려주세요.");
		}

	}
	


}


