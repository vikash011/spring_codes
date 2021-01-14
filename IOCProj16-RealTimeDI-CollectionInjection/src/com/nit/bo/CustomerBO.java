package com.nit.bo;

public class CustomerBO {

	private String cName;
	private String cAddr;
	private float pAmt;
	private float rate;
	private float time;
	private float intrAmt;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	public float getpAmt() {
		return pAmt;
	}

	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public float getIntrAmt() {
		return intrAmt;
	}

	public void setIntrAmt(float intrAmt) {
		this.intrAmt = intrAmt;
	}

}
