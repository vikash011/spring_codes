package com.nit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.modal.PoliticalParty;

@Service("partyService")
public interface IPoliticalPartyMgmtService {

	public PoliticalParty fetchPoliticalPartyDeatilsById(int partyId);

	public List<PoliticalParty> fetchPoliticalPartyNameByPartyName(String partyName1, String partyName2,
			String partyName3);

	public int updatePartyFlagColorByPartyName(String flagColor, String partyName);

}
