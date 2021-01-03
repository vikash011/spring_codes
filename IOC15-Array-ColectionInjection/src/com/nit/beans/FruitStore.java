//FruitStore.java
//Collection- MAp Injection

package com.nit.beans;

import java.util.Date;
import java.util.Map;

public class FruitStore {

	private Map<String, Float> fruitInfo;

	private Map<String, Date> impDates;

	public void setFruitInfo(Map<String, Float> fruitInfo) {
		this.fruitInfo = fruitInfo;
	}

	public void setImpDates(Map<String, Date> impDates) {
		this.impDates = impDates;
	}

	@Override
	public String toString() {
		return "FruitStore [fruitInfo=" + fruitInfo + ", impDates=" + impDates + "]"+"-->"+fruitInfo.getClass();
	}
	
	

}
