package day02;

public class Client {
	
	private String name;
	private int age;
	
	private static int nums;
	
	Client(String name, int age){
		this.name = name;
		this.age = age;
		nums++;
	}
	
	public static int how_nums() {
		return nums;
	}
}
