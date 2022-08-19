package example2;

import org.junit.Test;

public class Board {

	@Test
	public void board() {
		String msg = "게시물 등록";
		
		Login.login(msg);
		
		System.out.println(msg + "하기");
		
		Logout.logout(msg);
	}
}
