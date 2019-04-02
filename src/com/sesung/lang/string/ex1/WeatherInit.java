package com.sesung.lang.string.ex1;

public class WeatherInit {
	private String info;

	public WeatherInit() {
		info="seoul, 맑음, 10, 20, 0.3, daejeon, 비, -22, 50, 0.1,"
				+ "incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
	}

	//순서, city, state, tem, hum, mise

	public Weather [] getWeathers() {
		String [] total = info.split(",");
		Weather [] weathers = new Weather[total.length/5];
//		int index =0;
//		for(int i =0; i<weathers.length; i++) {
//			Weather w = new Weather();
//			w.setCity(total[i]);  // 0-5
//			w.setState(total[++i]);
//			w.setTem(total[++i]);
//			w.setHum(total[++i]);
//			w.setMise(total[++i]);
//			weathers[index]=w;
//			index++;
//		} //방법1

		for(int i =0; i<weathers.length; i=i+5) {
			Weather w = new Weather();
			w.setCity(total[i]);  // 0-5
			w.setState(total[i+1]);
			w.setTem(total[i+2]);
			w.setHum(total[i+3]);
			w.setMise(total[i+4]);
			weathers[i/5]=w;
		}//방법 2
		return weathers;
	}

}
