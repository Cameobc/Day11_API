package com.sesung.lang;

public class Object_1_Object {
	public static void main(String[] args) {
		// 클래스명.참조변수 = new 생성자()
		Object obj = new Object();
		Object obj2 = new Object();
		//호출 - 참조변수명.멤버변수명  // 참조변수명.멤버메서드명()
		boolean a = obj.equals(obj);
		System.out.println(a);
		String b = obj.toString();
		System.out.println(b);
		System.out.println(obj);
		int c = obj.hashCode();
		System.out.println(c);
		
		String ss="Hello World";
		String r = ss.substring(2, 5);
		System.out.println(r);
		
		r= ss.toUpperCase();
		System.out.println(r);
		r = r.toLowerCase();
		System.out.println(r);
		
		String str1 = "tset";
		String str2 = " test ";
		r = str2.trim();
		System.out.println(str2);
		System.out.println(r);
		
		r=String.valueOf(3);
		System.out.println(r);
		
		ss = "iu-choa-suzy-hani";
		String [] names = ss.split("-");
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		ss="a,b,c-d-e,f";
		r = ss.replace("-", ",");
		System.out.println(r);
				
		
	}

}
