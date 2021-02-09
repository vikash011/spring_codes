package com.nit.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named("fpkt") // cfgs java class as spring bean class
public class Flipkart {

	// field level

	@Inject // alternate to @Autowired
	@Named("dtdc") // alternate to @Qualifier

	// @Resource(name="ekart")
	private ICourier courier;

	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
	}

	/*
	 * //constructor level
	 * 
	 * @Named("bdart")
	 * 
	 * @Inject
	 * 
	 * public Flipkart(ICourier courier) { 
	 *  this.courier = courier;
	 * 
	 * }
	 */

	/*
	 * //Method level 
	 * // @Inject
	 *  // @Named("dtdc")
	 * 
	 * @Resource(name="ekart")
	 *  public void setICourier(ICourier courier) {
	 * this.courier=courier;
	 *  }
	 */

	/*
	 * // arbitary method level 
	 * //@Named("ekart")
	 * 
	 * @Resource(name="bdart")
	 *  //@Inject public void insert(ICourier courier) {
	 *     this.courier=courier;
	 * 
	 * }
	 */

//	b.logic
	public String shopping(String customer) {

		String msg = courier.deliver();

		return customer + " shopped at Flipkart and order delivered by " + msg;
	}

}
