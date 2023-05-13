package com.vti.entity;

public class Position {
	private int positionID;
	private String positionName;

	public Position(String positionName) {
		super();
		this.positionName = positionName;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}
