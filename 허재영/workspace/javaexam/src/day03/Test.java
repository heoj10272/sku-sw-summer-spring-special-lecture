package day03;

public class Test {
	public static void main(String[] args) {
		
		// 상속 - 필드나 메소드가 각각 하나씩 있을때는 고민할 필요가 없다.
		
		Parent p = new Parent();
		System.out.println(p.i);
		System.out.println(p.geti());
		
	
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.geti());
		
		Parent pc = new Child();
		System.out.println(pc.i);
		System.out.println(pc.geti());
		if (pc instanceof Child)
			((Child)pc).print();
	}
}
