package com.sesung.util.calender;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalenderTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		
		System.out.println("종료 시간 입력");
		String time = sc.next(); // 3-50  3시 50분
		String [] times = time.split("-");
		ca2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
		ca2.set(Calendar.MINUTE, Integer.parseInt(times[1]));
		long in = cal.getTimeInMillis();
		long out = ca2.getTimeInMillis();
		long result = out-in;
		long h = result/(1000*60*60);
		long m = result%(1000*60*60);
		System.out.println(h);
		if(m>0) {
			h++;
		}
		if(h<1) {
			h=1;
		}
		
		System.out.println("사용로 : "+h*1000);
		//시간당 1000
//		StringTokenizer st = new StringTokenizer(time, "-");
//		while(st.hasMoreTokens()) {
//			ca2.set(Calendar.HOUR, Integer.parseInt(st.nextToken().trim()));
//			ca2.set(Calendar.MINUTE, Integer.parseInt(st.nextToken().trim()));	
//		}
//		long l = cal.getTimeInMillis();
//		long l2 = ca2.getTimeInMillis();
//		long l3 = (l2-l)/(1000*60*60);
//		System.out.println("기본료 : "+l3*1000+ "추가금액 : "+l3*200);
	}

}
