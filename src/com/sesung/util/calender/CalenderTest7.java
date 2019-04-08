package com.sesung.util.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class CalenderTest7 {

	public static void main(String[] args) throws ParseException {
		String now = "2020-05-05";
		SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sp.parse(now);		
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.get(Calendar.MONTH));
		
	}
}
