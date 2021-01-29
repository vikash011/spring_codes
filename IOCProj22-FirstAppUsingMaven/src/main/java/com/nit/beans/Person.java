package com.nit.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

	private int pid;
	private String pname;
	private String paddr;
	private Date page;


}
