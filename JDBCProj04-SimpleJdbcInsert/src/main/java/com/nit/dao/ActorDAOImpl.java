package com.nit.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nit.model.Actor;

@Repository("actorDAO")
public class ActorDAOImpl implements IActorDAO {

	@Autowired
	private SimpleJdbcInsert sji;

	public ActorDAOImpl() {
		System.out.println("ActorDAOImpl.0-param constrcutor");
	}

	@Override
	public int insertActorDetails(Actor actor) throws Exception {

		try {

			// setting DB Table Name
			sji.setTableName("actor_details");

			// creating Map Object for Column Names and Column Values
			Map<String, Object> colNamesAndValues = Map.of("ACTORID", actor.getActorId(), "ACTORNAME",
					actor.getActorName(), "ACTORADDRESS", actor.getActorAddress(), "ACTORINCOME",
					actor.getActorIncome(), "ACTORMOBNO", actor.getActorMobNO());

			// executing SimpleJdbcInsert Operation
			int count = sji.execute(colNamesAndValues);

			/*
			 * // setting Table Name sji.setTableName("actor_details");
			 * 
			 * // using BeanPropertySqlParameterResource(when java Bean property==columns
			 * Name of Table) // executing simpleJdbcInsert int count = sji.execute(new
			 * BeanPropertySqlParameterSource(actor));
			 */
			return count;

		} catch (DataAccessException dae) {
			dae.printStackTrace();
			throw dae;

		}

	}

}
