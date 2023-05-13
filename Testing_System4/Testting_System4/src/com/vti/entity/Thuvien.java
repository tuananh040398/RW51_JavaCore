package com.vti.entity;

public abstract class Thuvien {
	private String tailieuId;
	private String NXB;
	private short sobanphathanh;

	public Thuvien(String tailieuId, String nXB, short sobanphathanh) {
		super();
		this.tailieuId = tailieuId;
		NXB = nXB;
		this.sobanphathanh = sobanphathanh;
	}

	
	
	public String getTailieuId() {
		return tailieuId;
	}



	public void setTailieuId(String tailieuId) {
		this.tailieuId = tailieuId;
	}



	public void setNXB(String nXB) {
		NXB = nXB;
	}



	public short getSobanphathanh() {
		return sobanphathanh;
	}



	public void setSobanphathanh(short sobanphathanh) {
		this.sobanphathanh = sobanphathanh;
	}



	@Override
	public String toString() {
		return "Thuvien [tailieuId=" + tailieuId + ", NXB=" + NXB + ", sobanphathanh=" + sobanphathanh + "]";
	}

}
