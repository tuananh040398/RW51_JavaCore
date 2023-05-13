package com.vti.entity;

public class Tapchi extends Thuvien {
	int sophathanh;
	byte thangphathanh;

	public Tapchi(String tailieuId, String nXB, short sobanphathanh, int sophathanh, byte thangphathanh) {
		super(tailieuId, nXB, sobanphathanh);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;
	}

	@Override
	public String toString() {
		return super.toString() + "Tapchi [sophathanh=" + sophathanh + ", thangphathanh=" + thangphathanh + "]";
	}

}
