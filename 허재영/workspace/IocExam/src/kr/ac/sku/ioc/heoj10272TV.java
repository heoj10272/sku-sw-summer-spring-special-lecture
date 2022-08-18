package kr.ac.sku.ioc;

import kr.ac.sku.ioc.TV;


public class heoj10272TV implements TV{

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("소리를 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("소리를 줄입니다.");
	}
	
}
