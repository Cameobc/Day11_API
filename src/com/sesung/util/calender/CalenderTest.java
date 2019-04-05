package com.sesung.util.calender;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		//추상클래스로 new 생성 XXXX
		Calendar cal = Calendar.getInstance();  // 현재시간/만들당시의/ 시간을 담고 있음
		System.out.println(cal);
		//특정한 날짜 데이터를 꺼낼 떄, get사용
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		int month  = cal.get(Calendar.MONTH);
		System.out.println(month+1);
		
		cal.set(Calendar.YEAR, 2100);
		System.out.println(cal.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, 0);
		System.out.println(cal.get(Calendar.MONTH));
		cal.set(Calendar.HOUR_OF_DAY, 22);
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
