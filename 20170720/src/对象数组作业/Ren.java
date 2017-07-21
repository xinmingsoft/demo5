package 对象数组作业;

public class Ren {
	//属性
	private int id;
	private String xm;
	private int nl;
	private String xb;
	
	//setter/getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public int getNl() {
		return nl;
	}
	public void setNl(int nl) {
		this.nl = nl;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	
	//构造方法
	public Ren() {
		super();
		
	}

	public Ren(int id,String xm,String xb,int nl) {
		this.id = id;
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
	}
	
	//用于输出属性的普通方法
	public void xianshi() {
		System.out.println("编号:"+this.id+",\t姓名:"+this.xm+",\t年龄:"+this.nl+",\t性别:"+this.xb);
	}
	
}
