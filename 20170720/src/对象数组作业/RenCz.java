package ����������ҵ;

//�����˲�ѯ ��� �޸� ɾ�� ��id��ѯ ����ķ���
public class RenCz {
	//��ѯȫ���ķ���
	//��Ҫһ������,��Ҫ��˭
	public void selectAll(Ren[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
	}
	
	//����������ӵķ���
	//��������,��������ӣ���ӵ���ʲô
	public Ren[] add(Ren[] arr,Ren ren)
	{
		//ѭ�����飬��������ڼ���Ԫ�ص�λ���ǿյģ���ren�Ķ������ȥ.
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == null)
			{
				arr[i] = ren;
				//����ѭ��
				break;
			}
		}
		return arr;
	}
	
	//�޸� ����id�޸�
	//����������Ҫ��˭��Ҫ�ĳ�ʲô
	public Ren[] edit(Ren[] arr,Ren ren)
	{
		for(int i=0;i<arr.length;i++)
		{
			//�ҵ�Ҫ�޸ĵ�id
			if(arr[i].getId() == ren.getId()) {
				arr[i].setNl(ren.getNl());
				arr[i].setXb(ren.getXb());
				arr[i].setXm(ren.getXm());
				break;
			}
		}
		return arr;
	}
	
	//ɾ�� ����id��ɾ��
	//����������������ɾ��Ҫɾ��id��
	public Ren[] delete(Ren[] arr,int id)
	{
		//���ҵ��������
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getId() == id)
			{
				//ɾ��
				arr[i] = null;
				break;
			}
		}
		return arr;
		
	}
	
	
	//��ѯ ����id��ѯ
	//Ҫ�������ң����Ǹ�id
	public void selectById(Ren[] arr, int id)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getId() == id)
			{
				arr[i].xianshi();
				break;
			}
		}
	}
	
	
}
