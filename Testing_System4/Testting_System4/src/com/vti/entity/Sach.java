package com.vti.entity;

public class Sach extends Thuvien {
	String tenTG;
	int sotrang;

	public Sach(String tailieuId, String nXB, short sobanphathanh, String tenTG, int sotrang) {
		super(tailieuId, nXB, sobanphathanh);
		this.tenTG = tenTG;
		this.sotrang = sotrang;
	}

	@Override
	public String toString() {
		return super.toString() + "Sach [tenTG=" + tenTG + ", sotrang=" + sotrang + "]";
	}

}
