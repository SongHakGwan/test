package example2;

import org.junit.Test;

public class Board {

	@Test
	public void board() {
		String msg = "�Խù� ���";
		
		Login.login(msg);
		
		System.out.println(msg + "�ϱ�");
		
		Logout.logout(msg);
	}
}
