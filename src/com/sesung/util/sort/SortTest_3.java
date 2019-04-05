package com.sesung.util.sort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SortTest_3 {
	public static void main(String[] args) {
		
		Member member = new Member("choa", 20);
		System.out.println(member);
		Member member2 = new Member("choa", 20);
		System.out.println(member == member2);
		System.out.println(member.equals(member2));
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
		
		
//		Member m1 = new Member("iu", 26);
//		Member m2 = new Member("choa", 32);
//		Member m3 = new Member("hani", 16);
//		Member m4 = new Member("suzy", 26);
//		ArrayList<Member> ar = new ArrayList<Member>();
//		ar.add(m1);
//		ar.add(m2);
//		ar.add(m3);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1. 나이순");
//		System.out.println("2. 이름순");
//		int select = sc.nextInt();
//		if(select ==1) {
//		}else {
//		}
//		Collections.sort(ar);
//		for(int i =0; i<ar.size(); i++) {
//			System.out.println("ID : "+ar.get(i).getId());
//			System.out.println("Age : "+ar.get(i).getAge());
//			System.out.println("============");
//		}
//		ArrayList<String> ar = new ArrayList<String>();
//		ArrayList<String> ar2 = new ArrayList<String>();
//		
//		ArrayList<ArrayList<String>> ar3 = new ArrayList<ArrayList<String>>();
//		ar3.add(ar);
//		ar3.add(ar2);
		
//		HashMap<ArrayList<String>, ArrayList<String>> map = new HashMap<ArrayList<String>, ArrayList<String>>();
//		map.put(ar, ar2);
	}
	
//	public static void sort(List<Comparable<Object>> ar) {
//		int num = ar.get(0).compareTo(ar.get(1));
//		if(num>0) {
//			
//		}else if(num<0) {
//			
//		}else {
//			
//		}
//	}

}
