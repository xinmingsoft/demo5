package ö������;

public class UseEnum {
	public static void main(String[] args) {
		// �õ�ö���������
		System.out.println(Color.GREEN.getDeclaringClass());
		
		// �õ�ö�����Ե�����
		System.out.println(Color.RED.name());
		
		// �õ������Ե��±�
		System.out.println(Color.PURPLE.ordinal());
		
		
		//ʹ��swtich��
		// ö�ٱ���
		Color color = Color.GREEN;
		
		//����color������������ж�
		switch(color)
		{
			//���color���������ֵ��RED
			case RED: 
				//��ô��Ҫ��һ������
				color = Color.RED;
				//����switch���
				break;
			case BLUE:
				color = Color.BLUE;
				break;
			case GREEN:
				color = Color.GREEN;
				break;
			case PURPLE:
				color = Color.PURPLE;
				break;
		}
	}
}
