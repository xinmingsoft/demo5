import java.util.ArrayList;

public class Test {
		
		public static void main(String[] args) {
			ArrayList<Person> list = new ArrayList<Person>();

			list.add(new Person(1,0,"����"));
			list.add(new Person(2,0,"��Ʒ"));
			list.add(new Person(3,1,"�ȵ�����"));
			list.add(new Person(4,1,"ʱ������"));
			list.add(new Person(5,2,"��ǰ��Ʒ"));
			list.add(new Person(6,2,"���²�Ʒ"));
			list.add(new Person(7,4,"��������"));
			list.add(new Person(8,4,"��������"));
			list.add(new Person(9,8,"����1������"));
			list.add(new Person(10,8,"����2������"));
			list.add(new Person(11,7,"����2������"));
			list.add(new Person(12,7,"����3������"));
			list.add(new Person(12,11,"����2���ص�����"));
			list.add(new Person(13,11,"����2��bu�ص�����"));
			list.add(new Person(14,0,"�����˵�"));
			
//			print(list,0,0);
//			
//			for(Person p : listn)
//			{
//				System.out.println(p.getName());
//			}
//			System.out.println("--------------------------------------------");
			
//			printId(list,1);
//			
//			for(Person p : listnn)
//			{
//				System.out.println(p.getName());
//			}
//			System.out.println("--------------------------------------------");
//			
//			printIdDepth1(list,8,1,0);
//			
//			for(Person p : listnnn)
//			{
//				System.out.println(p.getName());
//			}
		}
		
		
		static ArrayList<Person> listn = new ArrayList<Person>();
		/**
		 * ���޲˵�
		 * @param list ����
		 * @param pid  ����id
		 * @param depth ��ȱ�ʶ
		 * @return
		 */
		public static ArrayList<Person> print(ArrayList<Person> list,int pid,int depth)
		{
			//��ȼ�1
			depth++;
			//ѭ��ÿһ��
			for(Person p : list)
			{
				//������и�id==�ϼ�id
				if(p.getPid() == pid )
				{
					//�ҵ���
					p.setName(depth+p.getName());
					listn.add(p);
					print(list,p.getId(),depth);
				}
			}
			return listn;
		}
		
		
		static ArrayList<Person> listnn = new ArrayList<Person>();
		public static ArrayList<Person> printId(ArrayList<Person> list,int id)
		{
			for(Person p : list)
			{
				if(listnn.size() == 0 && p.getId() == id)
				{
					listnn.add(p);
				}
				if(p.getPid() == id)
				{
					listnn.add(p);
					printId(list,p.getId());
				}
			}
			return listnn;
		}
		
		
		static ArrayList<Person> listnnn = new ArrayList<Person>();
		
		/**
		 * 
		 * @param list  ����
		 * @param id	ָ��id
		 * @param depth ���  -1�������
		 * @param level ��ʶ  0�̶�
		 * @return
		 */
		public static ArrayList<Person> printIdDepth1(ArrayList<Person> list,int id,int depth,int level)
		{
			if(depth != -1)
			{
				level++;
				if(depth < level)
				{
					return listnnn;
				}
			}
			for(Person p : list)
			{
				if(listnn.size() == 0 && p.getId() == id)
				{
					listnnn.add(p);
				}
				if(p.getPid() == id)
				{
					listnnn.add(p);
					printIdDepth1(list,p.getId(),depth,level);
				}
			}
			return listnnn;
		}
	}
