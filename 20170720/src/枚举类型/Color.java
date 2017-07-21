package 枚举类型;

//为了避免数据类型转换而出现的各种问题. 从而使用这种类型.   这种类型叫做Enum 或者说  枚举
// 通常也会把枚举类型，当做常量来处理.
public enum Color {
	//定义属性
	RED,BLUE,GREEN,PURPLE;
	
	//看默认方法 : 是私有的。
	private Color() {
		// TODO Auto-generated constructor stub
	}
}
