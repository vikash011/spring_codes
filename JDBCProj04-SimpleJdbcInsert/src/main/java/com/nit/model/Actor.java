package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Actor {

	private Integer actorId;
	private String actorName;
	private String actorAddress;
	private Double actorIncome;
	private Long actorMobNO;

	public Actor() {
		System.out.println("Actor.0-param constructor");
	}

}
