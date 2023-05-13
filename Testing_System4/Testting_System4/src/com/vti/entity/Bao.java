package com.vti.entity;

import java.time.LocalDateTime;

public class Bao extends Thuvien {
	private String ngayphathanh;

	public Bao(String tailieuId, String nXB, short sobanphathanh, String ngayphathanh) {
		super(tailieuId, nXB, sobanphathanh);
		this.ngayphathanh = ngayphathanh;
	}

	@Override
	public String toString() {
		return super.toString() + "Bao [ngayphathanh=" + ngayphathanh + "]";
	}
	
	
}
