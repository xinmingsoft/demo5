import java.util.ArrayList;

public class Test {
		
		public static void main(String[] args) {
			ArrayList<Person> list = new ArrayList<Person>();

			list.add(new Person(1,0,"新闻"));
			list.add(new Person(2,0,"产品"));
			list.add(new Person(3,1,"热点新闻"));
			list.add(new Person(4,1,"时事新闻"));
			list.add(new Person(5,2,"以前产品"));
			list.add(new Person(6,2,"最新产品"));
			list.add(new Person(7,4,"今天新闻"));
			list.add(new Person(8,4,"明天新闻"));
			list.add(new Person(9,8,"明天1号新闻"));
			list.add(new Person(10,8,"明天2号新闻"));
			list.add(new Person(11,7,"今天2号新闻"));
			list.add(new Person(12,7,"今天3号新闻"));
			list.add(new Person(12,11,"今天2号重点新闻"));
			list.add(new Person(13,11,"今天2号bu重点新闻"));
			list.add(new Person(14,0,"顶级菜单"));
			
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
		 * 无限菜单
		 * @param list 集合
		 * @param pid  父级id
		 * @param depth 深度标识
		 * @return
		 */
		public static ArrayList<Person> print(ArrayList<Person> list,int pid,int depth)
		{
			//深度加1
			depth++;
			//循环每一个
			for(Person p : list)
			{
				//如果其中父id==上级id
				if(p.getPid() == pid )
				{
					//找到了
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
		 * @param list  集合
		 * @param id	指定id
		 * @param depth 深度  -1无限深度
		 * @param level 标识  0固定
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
