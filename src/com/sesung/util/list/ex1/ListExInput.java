package com.sesung.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
	
public class ListExInput {
	private Scanner sc;

	
	public ListExInput() {
		sc= new Scanner(System.in);
	}
	
	
	public Member setinfo() {
		Member member = new Member();
		System.out.println("이름 입력");
		String name = sc.next();
		member.setName(name);
		System.out.println("나이 입력");
		int age = sc.nextInt();
		member.setAge(age);
		
		return member;
	}

}
