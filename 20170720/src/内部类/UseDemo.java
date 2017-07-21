package 内部类;

public class UseDemo {
	public static void main(String[] args) {
		//创建内部类的对象
		Demo.Demo1 d1 = new Demo().new Demo1();
		d1.xianshi();
		
		//创建内部类的方法2  跟第一个意思一样
		Demo d2 = new Demo();
		Demo.Demo1 d3 = d2.new Demo1();
		d3.xianshi();
		
		
		//静态内部类对象
		Demo.Demo2 d4 = new Demo.Demo2();
		d4.xianshi();
	}
}
