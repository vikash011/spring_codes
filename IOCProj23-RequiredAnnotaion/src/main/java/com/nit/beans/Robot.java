package com.nit.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {

	private int roboId;
	private String roboName;
	private float roboWeight;
	private String roboCategory;

	
	@Required
	public void setRoboId(int roboId) {
		this.roboId = roboId;
	}

	@Required
	public void setRoboName(String roboName) {
		this.roboName = roboName;
	}

	public void setRoboWeight(float roboWeight) {
		this.roboWeight = roboWeight;
	}

	public void setRoboCategory(String roboCategory) {
		this.roboCategory = roboCategory;
	}

	@Override
	public String toString() {
		return "Robot [roboId=" + roboId + ", roboName=" + roboName + ", roboWeight=" + roboWeight + ", roboCategory="
				+ roboCategory + "]";
	}

	
	 
}
