package ����������ҵ;

public class Ren {
	//����
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
	
	//���췽��
	public Ren() {
		super();
		
	}

	public Ren(int id,String xm,String xb,int nl) {
		this.id = id;
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
	}
	
	//����������Ե���ͨ����
	public void xianshi() {
		System.out.println("���:"+this.id+",\t����:"+this.xm+",\t����:"+this.nl+",\t�Ա�:"+this.xb);
	}
	
}
