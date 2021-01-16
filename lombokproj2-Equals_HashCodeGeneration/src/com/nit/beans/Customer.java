package com.nit.beans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString          //generates toString()
@EqualsAndHashCode   //generates equals and hashcode()
public class Customer {

	private int cno;
	private String cname;
	private String caddr;
	private float billsAmt;

}
