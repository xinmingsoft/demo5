package �ڲ���;

public class UseDemo {
	public static void main(String[] args) {
		//�����ڲ���Ķ���
		Demo.Demo1 d1 = new Demo().new Demo1();
		d1.xianshi();
		
		//�����ڲ���ķ���2  ����һ����˼һ��
		Demo d2 = new Demo();
		Demo.Demo1 d3 = d2.new Demo1();
		d3.xianshi();
		
		
		//��̬�ڲ������
		Demo.Demo2 d4 = new Demo.Demo2();
		d4.xianshi();
	}
}
