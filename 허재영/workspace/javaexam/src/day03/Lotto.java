package day03;

public class Lotto {
	int num;
	public void generateNum() {
		this.num = (int)(Math.random()*100%45);
	}
	public int getNum() {
		return this.num;
	}
}
