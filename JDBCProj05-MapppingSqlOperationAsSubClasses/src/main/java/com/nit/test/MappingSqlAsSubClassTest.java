package com.nit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.modal.PoliticalParty;
import com.nit.service.PoliticalPartyMgmtServiceImpl;

public class MappingSqlAsSubClassTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {

//	creating IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/nit/cfgs/applicationContext.xml");

//		creating Object for service class
		PoliticalPartyMgmtServiceImpl service = ctx.getBean("partyService", PoliticalPartyMgmtServiceImpl.class);

//		invoking service class Method

		try {

			PoliticalParty party = service.fetchPoliticalPartyDeatilsById(1001);

			if (party != null) {
				System.out.println("Party details Having partyId::" + party);

			} else {
				System.out.println("Party Record Not Found");
			}

			System.out.println("__________________________________________________________");

			List<PoliticalParty> partyList = service.fetchPoliticalPartyNameByPartyName("BJP", "AAP", "CONGRESS");

			if (partyList != null || partyList.size() >= 1) {
				partyList.forEach(System.out::println);
			} else {
				System.out.println("No parties Found");
			}

			System.out.println("--------------------------------------------------------------");

			int count = service.updatePartyFlagColorByPartyName("Black", "BJP1");
			if (count == 1) {
				System.out.println("Flag Color Upadted");

			} else {
				System.out.println("Flag Color Not Updated");
			}
			System.out.println("_________________________________________________________________");

		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			((AbstractApplicationContext) ctx).close();
		}

	}

}
