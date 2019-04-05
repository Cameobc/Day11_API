package com.sesung.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {
	
	public static void main(String[] args) {
		int [] lotto = new int [6];
		String [] s = new String[3];
		Random r = new Random();
		s[0] = "test";
		s[1] = "zoo";
		s[2] = "apple";
		
		
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45+1);
			System.out.print(lotto[i]+"\t");
		}
		System.out.println("");
		Arrays.sort(lotto);
		Arrays.sort(s);
		for(int i =0; i<s.length; i++) {
//		System.out.print(lotto[i]+"\t");
		System.out.print(s[i]+"\t");
		}
		
	}

}
