package com.sesung.util.map;

import java.util.HashMap;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("n1", 1);
		map.put("n2", 2);
		
		System.out.println(map.get("n1"));
		System.out.println(map.get("n2"));
		
		map.put("n1", 3);
		System.out.println(map.get("n1"));
		System.out.println(map);
		
// 포문 사용 못함		for(int i=0; i<map.size(); i++) {
//			System.out.println(map.get(i));
//		}
	}

}
