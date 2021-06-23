package com.nit.modal;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PoliticalParty {

	private Integer partyId;
	@NonNull
	private String flagColor;
	@NonNull
	private String partyName;
	@NonNull
	private String partySymbol;

	public PoliticalParty() {

	}

}
