package day03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods cup = new Goods("컵");
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println("이름 : "+camera.getName());
	}

}