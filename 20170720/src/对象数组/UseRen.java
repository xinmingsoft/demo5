package 对象数组;

public class UseRen {
	public static void main(String[] args) {
		//使用人类././以对象数组的形式
		// 创建对象数组  添加对象  输出数组中每一个对象  修改对象  删除对象   交换对象  对某一个属性进行排序
		
//		int[] a = new int[10];
//		String[] b = new String[10];
		
		//创建. 需要new两次，第一次new长度, 第二次new对象
		Ren[] arr = new Ren[10]; //第一次new长度

		//添加对象
		arr[0] = new Ren("曹操","女",20,"210123456789");//第二次new,new Ren()对象;
		arr[1] = new Ren("张辽","男",63,"210987654321");//第二次new,new Ren()对象;
		arr[2] = new Ren("曹丕","女",48,"210147258369");//第二次new,new Ren()对象;
		arr[3] = new Ren("赵云","男",65,"210963852741");//第二次new,new Ren()对象;
		arr[4] = new Ren("吕布","男",11,"210159482673");//第二次new,new Ren()对象;
		arr[5] = new Ren("关羽","女",24,"210987123645");//第二次new,new Ren()对象;
		arr[6] = new Ren("张飞","男",34,"210357246891");//第二次new,new Ren()对象;
		arr[7] = new Ren("小乔","女",88,"210467913258");//第二次new,new Ren()对象;
		arr[8] = new Ren("貂蝉","男",31,"210654823971");//第二次new,new Ren()对象;
		arr[9] = new Ren("诸葛","男",70,"210963258741");//第二次new,new Ren()对象;
		
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			arr[i].xianshi();
		}
		
		//关羽的年龄修改为33。
		//我要找的姓名
		String cz = "关羽";
		//循环，跟数组中的每一个对象的姓名进行比较，如果相等，那么得到该对象，并修改年龄属性
		for(int i=0;i<arr.length;i++)
		{
			//跟数组中的每一个对象的姓名进行比较
			if("关羽".equals(arr[i].getXm()))
			{
				//如果进到这个大括号里.表示找到了该对象
				arr[i].setNl(33);
			}
		}
		System.out.println("----------------修改后---------------------");
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			arr[i].xianshi();
		}
		
		//删除对象  就是把某个对象设置为null就可以
		//删除赵云
		//arr[3] = null;
		System.out.println("----------------删除后---------------------");
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		
		//交换对象
		System.out.println("----------------交换对象后---------------------");
		//需要第三个Ren类对象
		Ren temp = arr[1];
		arr[1] = arr[9];
		arr[9] = temp;
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		//交换属性
		System.out.println("----------------交换年龄后---------------------");
		int t = arr[0].getNl();
		arr[0].setNl(arr[1].getNl());
		arr[1].setNl(t);
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
		
		//年龄排序
		// 1, 外侧循环长度-1
		// 2, 内侧循环长度-i-1
		// 3, j个元素和j+1个元素比较并交换(对象)
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				//比较的是年龄
				if(arr[j].getNl() > arr[j+1].getNl())
				{
					//交换的是对象
					Ren tt = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tt;
				}
			}
		}
		System.out.println("---------------排序后-----------------");
		//输出对象数组中所有的元素
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
	}
}
