package com.nit.beans;

import lombok.Data;
import lombok.NonNull;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString          //generates toString()
@EqualsAndHashCode  */ //generates equals and hashcode()

@Data    //(Getter+Setter+RequiredArgsConstructor+ToString()+EqualsAndhashCode())
public class Customer {

	@NonNull
	private int cno;
	private String cname;
	private String caddr;
	private float billsAmt;

}
