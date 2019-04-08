package com.sesung.util.calender;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest6 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//2019년 4월 8일 9 시 13분 <- 원하는 출력
		
//		int year = calendar.get(Calendar.YEAR);
//		System.out.println(year +"년");
		String pattern = "yyyy년 MM월 dd일 HH:mm E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		long now = calendar.getTimeInMillis();
//		Date date = new Date();
//		date.setTime(now);
//		Date date = new Date(now);
		Date date = calendar.getTime();
		
		String result = sd.format(date);
		System.out.println(result);
//		String st = calendar.toString();
//		Date ar =Date.valueOf(st);
//		String result = sd.format(ar);
		

		
	}

}
