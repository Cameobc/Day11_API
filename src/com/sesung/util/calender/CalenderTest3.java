package com.sesung.util.calender;

import java.util.Calendar;

public class CalenderTest3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
//		ca2.set(Calendar.MINUTE, 40);
//		ca2.add(Calendar.DATE, 2);
		ca2.set(1992, 9, 4);
		
		long l = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		System.out.println(l2/(1000*60*60*24));
//		long l3 = l2-l;
//		System.out.println(l);
//		System.out.println(l3/(1000*60*60*24));
		
	}
}
