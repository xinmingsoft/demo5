package ��������;

public class Ren {
	//����
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
	
	//���췽��
	public Ren() {
		super();
		
	}

	public Ren(String xm,String xb,int nl,String sfz) {
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.sfz = sfz;
	}
	
	//����������Ե���ͨ����
	public void xianshi() {
		System.out.println("����:"+this.xm+",\t����:"+this.nl+",\t�Ա�:"+this.xb+",\t���֤:"+this.sfz);
	}
	
}
