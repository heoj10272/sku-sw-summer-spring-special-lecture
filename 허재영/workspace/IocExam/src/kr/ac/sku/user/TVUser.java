package kr.ac.sku.user;

import kr.ac.sku.ioc.TV;
import kr.ac.sku.ioc.TVFactory;
import kr.ac.sku.ioc.heoj10272TV;

public class TVUser {
	
	public static void main(String[] args) {
		
		TV tv = TVFactory.getTV("heoj10272");
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
	}
}
