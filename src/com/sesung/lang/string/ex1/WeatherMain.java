package com.sesung.lang.string.ex1;

public class WeatherMain {
	public static void main(String[] args) {
		WeatherInit it = new WeatherInit();
		Weather[] weathers =it.getWeathers();
		
		for(int i =0; i<weathers.length; i++) {
			System.out.println("City : "+weathers[i].getCity());
			System.out.println("State : "+weathers[i].getState());
		}
	}

}
