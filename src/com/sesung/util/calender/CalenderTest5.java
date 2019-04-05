package com.sesung.util.calender;

import java.util.Calendar;

public class CalenderTest5 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3, 1);
		int start = ca.get(Calendar.DAY_OF_WEEK);
		int max = ca.getActualMaximum(Calendar.DATE);
		System.out.print("일\t월\t화\t수\t묵\t금\t토");
		System.out.println();
		
		for(int j=1; j<start; j++) {
			System.out.print("\t");
		}
		for(int i =1;i<=max;i++) {
			System.out.print(i+"\t");
			if(((start+i-1)%7)==0) {  //if 안쪽의 조건문에다 -1울 주거나 start 에다가 -1을 줘야한다.
				System.out.println();
			}
		}
		System.out.println();
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(ca.getTime());
	}
}
