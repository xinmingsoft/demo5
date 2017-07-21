package 对象数组作业;

import java.util.Scanner;


public class TestRen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//这个是为了调用里面的方法
		RenCz cz = new RenCz();
		//需要对象数组
		Ren[] arr = new Ren[100]; //第一次new长度

		//添加对象
		arr[0] = new Ren(1,"曹操","女",20);
		arr[1] = new Ren(2,"张辽","男",63);
		arr[2] = new Ren(3,"曹丕","女",48);
		arr[3] = new Ren(4,"赵云","男",65);
		arr[4] = new Ren(5,"吕布","男",11);
		arr[5] = new Ren(6,"关羽","女",24);
		arr[6] = new Ren(7,"张飞","男",34);
		arr[7] = new Ren(8,"小乔","女",88);
		arr[8] = new Ren(9,"貂蝉","男",31);
		arr[9] = new Ren(10,"诸葛","男",70);
		//在主方法中，使用死循环的方式，不断对对象数组进行操作
		while(true)
		{
			System.out.println("选择操作 : 1，查询全部   2,添加   3,修改  4,删除   5,按id查询    6,退出");
			String input = scan.nextLine();
			if("1".equals(input))
			{
				cz.selectAll(arr);
			}
			else if("2".equals(input))
			{
				System.out.println("输入id");
				String id = scan.nextLine();
				System.out.println("输入姓名");
				String xm = scan.nextLine();
				System.out.println("输入年龄");
				String nl = scan.nextLine();
				System.out.println("输入性别");
				String xb = scan.nextLine();
				
				Ren aa = new Ren(Integer.parseInt(id),xm,xb,Integer.parseInt(nl));
				//调用添加的方法
				cz.add(arr, aa);
			}
			else if("3".equals(input))
			{
				System.out.println("输入要修改的id");
				String id = scan.nextLine();
				System.out.println("输入新的姓名");
				String xm = scan.nextLine();
				System.out.println("输入新的年龄");
				String nl = scan.nextLine();
				System.out.println("输入新的性别");
				String xb = scan.nextLine();
				
				Ren aa = new Ren(Integer.parseInt(id),xm,xb,Integer.parseInt(nl));
				//调用修改的方法
				cz.edit(arr, aa);
			}
			else if("4".equals(input))
			{
				System.out.println("输入要删除的id");
				String id = scan.nextLine();
				
				cz.delete(arr, Integer.parseInt(id));
			}
			else if("5".equals(input))
			{
				System.out.println("输入要删除的id");
				String id = scan.nextLine();
				
				cz.selectById(arr, Integer.parseInt(id));
			}
			else if("6".equals(input))
			{
				break;
			}
			else 
			{
				System.out.println("输入有误");
			}
		}
	}
}
