package ����������ҵ;

import java.util.Scanner;


public class TestRen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�����Ϊ�˵�������ķ���
		RenCz cz = new RenCz();
		//��Ҫ��������
		Ren[] arr = new Ren[100]; //��һ��new����

		//��Ӷ���
		arr[0] = new Ren(1,"�ܲ�","Ů",20);
		arr[1] = new Ren(2,"����","��",63);
		arr[2] = new Ren(3,"��ا","Ů",48);
		arr[3] = new Ren(4,"����","��",65);
		arr[4] = new Ren(5,"����","��",11);
		arr[5] = new Ren(6,"����","Ů",24);
		arr[6] = new Ren(7,"�ŷ�","��",34);
		arr[7] = new Ren(8,"С��","Ů",88);
		arr[8] = new Ren(9,"����","��",31);
		arr[9] = new Ren(10,"���","��",70);
		//���������У�ʹ����ѭ���ķ�ʽ�����϶Զ���������в���
		while(true)
		{
			System.out.println("ѡ����� : 1����ѯȫ��   2,���   3,�޸�  4,ɾ��   5,��id��ѯ    6,�˳�");
			String input = scan.nextLine();
			if("1".equals(input))
			{
				cz.selectAll(arr);
			}
			else if("2".equals(input))
			{
				System.out.println("����id");
				String id = scan.nextLine();
				System.out.println("��������");
				String xm = scan.nextLine();
				System.out.println("��������");
				String nl = scan.nextLine();
				System.out.println("�����Ա�");
				String xb = scan.nextLine();
				
				Ren aa = new Ren(Integer.parseInt(id),xm,xb,Integer.parseInt(nl));
				//������ӵķ���
				cz.add(arr, aa);
			}
			else if("3".equals(input))
			{
				System.out.println("����Ҫ�޸ĵ�id");
				String id = scan.nextLine();
				System.out.println("�����µ�����");
				String xm = scan.nextLine();
				System.out.println("�����µ�����");
				String nl = scan.nextLine();
				System.out.println("�����µ��Ա�");
				String xb = scan.nextLine();
				
				Ren aa = new Ren(Integer.parseInt(id),xm,xb,Integer.parseInt(nl));
				//�����޸ĵķ���
				cz.edit(arr, aa);
			}
			else if("4".equals(input))
			{
				System.out.println("����Ҫɾ����id");
				String id = scan.nextLine();
				
				cz.delete(arr, Integer.parseInt(id));
			}
			else if("5".equals(input))
			{
				System.out.println("����Ҫɾ����id");
				String id = scan.nextLine();
				
				cz.selectById(arr, Integer.parseInt(id));
			}
			else if("6".equals(input))
			{
				break;
			}
			else 
			{
				System.out.println("��������");
			}
		}
	}
}
