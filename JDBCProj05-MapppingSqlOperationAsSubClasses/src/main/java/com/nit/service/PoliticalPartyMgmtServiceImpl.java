package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IPoliticalPartyDAO;
import com.nit.modal.PoliticalParty;

@Service("partyService")
public class PoliticalPartyMgmtServiceImpl implements IPoliticalPartyMgmtService {

	@Autowired
	private IPoliticalPartyDAO dao;

	@Override
	public PoliticalParty fetchPoliticalPartyDeatilsById(int partyId) {
		PoliticalParty party = dao.getPoliticalPartyDetailsById(partyId);
		return party;
	}

	@Override
	public List<PoliticalParty> fetchPoliticalPartyNameByPartyName(String partyName1, String partyName2,
			String partyName3) {

		List<PoliticalParty> partyList = dao.getPoliticalPartyByPartyName(partyName1, partyName2, partyName3);

		return partyList;
	}

	@Override
	public int updatePartyFlagColorByPartyName(String flagColor, String partyName) {
		int count = dao.updatePartyFlagColourBypartyName(flagColor, partyName);
		return count;
	}

}
