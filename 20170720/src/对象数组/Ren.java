package 对象数组;

public class Ren {
	//属性
	private String xm;
	private int nl;
	private String xb;
	private String sfz;
	
	//setter/getter
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
	public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
	
	//构造方法
	public Ren() {
		super();
		
	}

	public Ren(String xm,String xb,int nl,String sfz) {
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.sfz = sfz;
	}
	
	//用于输出属性的普通方法
	public void xianshi() {
		System.out.println("姓名:"+this.xm+",\t年龄:"+this.nl+",\t性别:"+this.xb+",\t神风证:"+this.sfz);
	}
	
}
