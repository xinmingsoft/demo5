package 内部类;

public class Demo {
	// 属性
	int a;
	static int b;
	
	//类中的类 (内部类)
	class Demo1{
		//定义一个普通方法
		public void xianshi() {
			System.out.println("内部类的方法被调用");
		}
	}
	
	//静态内部类
	static class Demo2{
		//定义普通方法
		public void xianshi() {
			System.out.println("静态内部类的方法被调用");
		}
	}
}
