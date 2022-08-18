package kr.ac.sku.ioc;

public class DingdingTV implements TV {
	private boolean power;
	private int volume;
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void volumeUp() {
		System.out.println("소리를 높입니다.");
	}
	
	public void volumeDown() {
		System.out.println("소리를 낮춥니다.");
	}
}

