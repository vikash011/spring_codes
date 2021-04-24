package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.model.Actor;
import com.nit.service.IActorMgmtService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {

		try {

//		creating IOC
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating Object for Service class
			IActorMgmtService service = ctx.getBean("actorService", IActorMgmtService.class);

//		creating Object for Actor1
			Actor actor1 = new Actor();
			actor1.setActorId(1002);
			actor1.setActorName("mohan");
			actor1.setActorAddress("Mumbai");
			actor1.setActorIncome(32552.725);
			actor1.setActorMobNO(989898989987l);

//		invoking method
			int result = service.addActorDetails(actor1);

			System.out.println(result == 0 ? "Problem In Record Insertion" : "Record Added Succesfully");

//		close IOC Container
			((AbstractApplicationContext) ctx).close();

		} catch (DataAccessException dae) {
			dae.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
