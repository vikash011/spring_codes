package com.nit.dao;

import java.util.List;

import com.nit.modal.PoliticalParty;

public interface IPoliticalPartyDAO {

	public PoliticalParty getPoliticalPartyDetailsById(int partyId);

	public List<PoliticalParty> getPoliticalPartyByPartyName(String partyName1, String partyName2, String partyName3);

	public int updatePartyFlagColourBypartyName(String flagColor, String partyName);

}
