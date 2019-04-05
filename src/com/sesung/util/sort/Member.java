package com.sesung.util.sort;

public class Member implements Comparable<Member> {

	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
		System.out.println("this : "+this);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this.age==((Member)obj).getAge()) {
//			
//		}
//		return super.equals(obj);
//	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int compareTo(Member o) {
//		int result;
//		
//		if(this.age > o.getAge()) {
//			result=1;
//		}else if(this.age < o.getAge()) {
//			result=-1;
//		}else {
//			result = 0;
//		}
//		return result;
//	}
//	@Override
//	public int compareTo(Member o) {
//		//ID 순으로 a~ z : 오름차순
//		int result;
//		
//		result = this.id.compareTo(o.getId());
//		if(result>0) {
//			result =-1;
//		}else {
//			result = 1;
//		} //내림차순
//		
//		return result;
//	}
	
	public int compareTo(Member o) {
		int result;
		if(this.age> o.getAge()) {
			result = 1;
		}else if(this.age==o.getAge()) {
			result =0;
		}else {
			result = -1;
		}
		return result;
	} // 숫자 오름차순
	
	
	
	
	
}
