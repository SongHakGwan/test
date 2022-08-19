package example3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("---�Խù� ��� �ϱ�---");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board(); // �ٽɱ�� 
	}
}
/*
�α��μ���
�ȳ��ϼ���
DB �۾� ������
�Խù� ��� �ϱ�:�ٽɱ��
�α׾ƿ� ����
*/


