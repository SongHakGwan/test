package example2;

public class Order {

	public void order() {
		String msg = "상품 주문";
		
		System.out.println(msg + "을 하기 위한 로그인 수행"); // 공통기능(Aspect)
		System.out.println(msg + "하기");
		System.out.println(msg + "을 DB에 저장");
		System.out.println(msg + "을 하기 위한 로그아웃 수행");		
	}
}
