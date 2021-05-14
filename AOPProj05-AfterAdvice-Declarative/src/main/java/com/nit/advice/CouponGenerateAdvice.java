package com.nit.advice;

import java.io.FileWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;

public class CouponGenerateAdvice {

	public void coupon(JoinPoint jp, double billAmt) throws Throwable {
		System.out.println("CouponGenerateAdvice.coupon(__started)");

//		generating coupons messages
		String couponMessage = "";
		if (billAmt > 50000) {
			couponMessage = "Avail 30% discount on next Purchase ";
		} else if (billAmt > 30000) {
			couponMessage = "Avail 20% discount on next purchase";
		} else {
			couponMessage = "Avail 5% discount on next purchse";
		}

//		generating coupon in text file 

		Writer writer = new FileWriter("c://vikash/logs/coupons.txt");
		writer.write(couponMessage);
		writer.flush();

//		closing writer
		writer.close();

		System.out.println("CouponGenerateAdvice.coupon(__ended)");
	}

}
