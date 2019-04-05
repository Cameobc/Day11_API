package com.sesung.util.calender;

import java.util.Calendar;

public class CalenderTest2 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		//생일 세팅
		//내가 태어난 요일이 무슨 요일?
		c1.set(1992, 9, 4);
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		
		c1 = Calendar.getInstance();
//		int d = c1.get(Calendar.DATE)+3;
//		c1.set(Calendar.DATE, d);
		System.out.println("Month : "+c1.get(Calendar.MONTH));
//		c1.roll(Calendar.DATE, 28);
		c1.add(Calendar.DATE, 28);
		System.out.println("Month : "+c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DATE));
		
	}

}
