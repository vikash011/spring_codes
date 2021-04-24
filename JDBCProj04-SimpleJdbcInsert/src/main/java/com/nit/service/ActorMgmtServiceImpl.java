package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IActorDAO;
import com.nit.model.Actor;

@Service("actorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorDAO dao;

	public ActorMgmtServiceImpl() {
		System.out.println("ActorMgmtServiceImpl.0-param constructor");
	}

	@Override
	public int addActorDetails(Actor actor) throws Exception {

//		use DAO
		int count = dao.insertActorDetails(actor);
		return count;
	}

}
