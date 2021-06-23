package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nit.modal.PoliticalParty;

@Repository("partyDAO")
public class PoliticalPartyDAOImpl implements IPoliticalPartyDAO {

	private static final String get_party_details_by_id = "select PARTYID,PARTYNAME,FLAGCOLOR,PARTYFLAG from POLITICALPARTY where PARTYID=?";

	private static final String get_party_details_by_names = "select PARTYID,PARTYNAME,FLAGCOLOR,PARTYFLAG from POLITICALPARTY where PARTYNAME in(?,?,?)";

	private static final String update_flag_color_by_partyName = "update POLITICALPARTY set FLAGCOLOR=? where PARTYNAME=?";

	private PoliticalPartySelector1 selector1;
	private PoliticalPartySelector2 selector2;
	private PoliticalPartyUpdetor1 updetor1;

	public PoliticalPartyDAOImpl(DataSource ds) {

		System.out.println("PoliticalPartyDAOImpl.PoliticalPartyDAOImpl()");
		selector1 = new PoliticalPartySelector1(ds, get_party_details_by_id);
		selector2 = new PoliticalPartySelector2(ds, get_party_details_by_names);
		updetor1 = new PoliticalPartyUpdetor1(ds, update_flag_color_by_partyName);
	}

	@Override
	public List<PoliticalParty> getPoliticalPartyByPartyName(String partyName1, String partyName2, String partyName3) {
		List<PoliticalParty> party = selector2.execute(partyName1, partyName2, partyName3);

		return party;
	}

	@Override
	public int updatePartyFlagColourBypartyName(String flagColor, String partyName) {

		int count = updetor1.update(flagColor, partyName);

		return count;
	}

	@Override
	public PoliticalParty getPoliticalPartyDetailsById(int partyId) {
		PoliticalParty party = selector1.findObject(partyId);

		return party;
	}

//	static inner class as Sub class  for Selector1
	private static class PoliticalPartySelector1 extends MappingSqlQuery<PoliticalParty> {

		public PoliticalPartySelector1(DataSource ds, String querry) {
			super(ds, querry);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();

		}

		@Override
		protected PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {

//			copy ResultSet Object to Model class Object
			PoliticalParty party = new PoliticalParty();

			party.setPartyId(rs.getInt(1));
			party.setPartyName(rs.getString(2));
			party.setFlagColor(rs.getString(3));
			party.setPartySymbol(rs.getString(4));

			return party;
		}

	}

//	static inner class  as sub class for Selector2
	private static class PoliticalPartySelector2 extends MappingSqlQuery<PoliticalParty> {

		public PoliticalPartySelector2(DataSource ds, String querry) {

			super(ds, querry);
			super.setParameters(new SqlParameter(Types.VARCHAR));
			super.setParameters(new SqlParameter(Types.VARCHAR));
			super.setParameters(new SqlParameter(Types.VARCHAR));
			super.compile();

		}

		@Override
		protected PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {

//			Converting ResultSet Object to Model class Object
			PoliticalParty party = new PoliticalParty();

			party.setPartyId(rs.getInt(1));
			party.setPartyName(rs.getString(2));
			party.setFlagColor(rs.getString(3));
			party.setPartySymbol(rs.getString(4));

			return party;
		}

	}

//	static inner Class As Sub class Updater1
	private static class PoliticalPartyUpdetor1 extends SqlUpdate {

		public PoliticalPartyUpdetor1(DataSource ds, String querry) {

			super(ds, querry);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.compile();

		}

	}

}
