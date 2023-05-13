package com.vti.entity;

public class Congnhan extends Canbo {
	byte bac;

	public Congnhan(String name, byte tuoicn, Gender gender, String address, byte capbaccn) {
		super(name, tuoicn, gender, address);
		this.bac = capbaccn;
	}

	@Override
	public String toString() {
		return super.toString() + "Congnhan [bac=" + bac + "]";
	}

}
