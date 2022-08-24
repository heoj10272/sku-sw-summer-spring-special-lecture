package kr.ac.sku.ioc;

public class TVFactory {
	public static TV getTV(String tvName) {
		TV tv = null;
		if ("heoj10272".equals(tvName)) {
			tv = new heoj10272TV();
		}
		else if ("ding".equals(tvName)){
			tv = new DingdingTV();
		}
		return tv;
	}
}
