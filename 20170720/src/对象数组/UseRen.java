package ��������;

public class UseRen {
	public static void main(String[] args) {
		//ʹ������././�Զ����������ʽ
		// ������������  ��Ӷ���  ���������ÿһ������  �޸Ķ���  ɾ������   ��������  ��ĳһ�����Խ�������
		
//		int[] a = new int[10];
//		String[] b = new String[10];
		
		//����. ��Ҫnew���Σ���һ��new����, �ڶ���new����
		Ren[] arr = new Ren[10]; //��һ��new����

		//��Ӷ���
		arr[0] = new Ren("�ܲ�","Ů",20,"210123456789");//�ڶ���new,new Ren()����;
		arr[1] = new Ren("����","��",63,"210987654321");//�ڶ���new,new Ren()����;
		arr[2] = new Ren("��ا","Ů",48,"210147258369");//�ڶ���new,new Ren()����;
		arr[3] = new Ren("����","��",65,"210963852741");//�ڶ���new,new Ren()����;
		arr[4] = new Ren("����","��",11,"210159482673");//�ڶ���new,new Ren()����;
		arr[5] = new Ren("����","Ů",24,"210987123645");//�ڶ���new,new Ren()����;
		arr[6] = new Ren("�ŷ�","��",34,"210357246891");//�ڶ���new,new Ren()����;
		arr[7] = new Ren("С��","Ů",88,"210467913258");//�ڶ���new,new Ren()����;
		arr[8] = new Ren("����","��",31,"210654823971");//�ڶ���new,new Ren()����;
		arr[9] = new Ren("���","��",70,"210963258741");//�ڶ���new,new Ren()����;
		
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			arr[i].xianshi();
		}
		
		//����������޸�Ϊ33��
		//��Ҫ�ҵ�����
		String cz = "����";
		//ѭ�����������е�ÿһ��������������бȽϣ������ȣ���ô�õ��ö��󣬲��޸���������
		for(int i=0;i<arr.length;i++)
		{
			//�������е�ÿһ��������������бȽ�
			if("����".equals(arr[i].getXm()))
			{
				//������������������.��ʾ�ҵ��˸ö���
				arr[i].setNl(33);
			}
		}
		System.out.println("----------------�޸ĺ�---------------------");
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			arr[i].xianshi();
		}
		
		//ɾ������  ���ǰ�ĳ����������Ϊnull�Ϳ���
		//ɾ������
		//arr[3] = null;
		System.out.println("----------------ɾ����---------------------");
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		
		//��������
		System.out.println("----------------���������---------------------");
		//��Ҫ������Ren�����
		Ren temp = arr[1];
		arr[1] = arr[9];
		arr[9] = temp;
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		//��������
		System.out.println("----------------���������---------------------");
		int t = arr[0].getNl();
		arr[0].setNl(arr[1].getNl());
		arr[1].setNl(t);
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		//��������
		// 1, ���ѭ������-1
		// 2, �ڲ�ѭ������-i-1
		// 3, j��Ԫ�غ�j+1��Ԫ�رȽϲ�����(����)
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				//�Ƚϵ�������
				if(arr[j].getNl() > arr[j+1].getNl())
				{
					//�������Ƕ���
					Ren tt = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tt;
				}
			}
		}
		System.out.println("---------------�����-----------------");
		//����������������е�Ԫ��
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
	}
}
