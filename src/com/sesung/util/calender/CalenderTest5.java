package com.sesung.util.calender;

import java.util.Calendar;

public class CalenderTest5 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(2016, 1, 1);
		int start = ca.get(Calendar.DAY_OF_WEEK)-1;
		int max = ca.getActualMaximum(Calendar.DATE);
		System.out.print("일\t월\t화\t수\t묵\t금\t토");
		System.out.println();
		
		for(int j=0; j<start; j++) {
			System.out.print("\t");
		}
		for(int i =1;i<=max;i++) {
			System.out.print(i+"\t");
			if(((start+i)%7)==0) {
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
