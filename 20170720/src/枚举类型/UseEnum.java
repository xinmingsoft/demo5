package 枚举类型;

public class UseEnum {
	public static void main(String[] args) {
		// 得到枚举类的名字
		System.out.println(Color.GREEN.getDeclaringClass());
		
		// 得到枚举属性的名字
		System.out.println(Color.RED.name());
		
		// 得到该属性的下标
		System.out.println(Color.PURPLE.ordinal());
		
		
		//使用swtich。
		// 枚举变量
		Color color = Color.GREEN;
		
		//对于color这个变量进行判断
		switch(color)
		{
			//如果color这个变量的值是RED
			case RED: 
				//那么需要做一下内容
				color = Color.RED;
				//结束switch语句
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
