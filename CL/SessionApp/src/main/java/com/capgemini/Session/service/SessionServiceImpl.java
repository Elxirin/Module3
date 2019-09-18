package com.capgemini.Session.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Session.beans.Session;
import com.capgemini.Session.dao.SessionRepository;
import com.capgemini.Session.exceptions.SessionException;

@Service
public class SessionServiceImpl implements SessionService{

	@Autowired
	private SessionRepository sessionRepository;
	
	@Override
	public List<Session> getAllSession() throws SessionException {
		try {
			return sessionRepository.findAll();
		} catch (Exception e) {
			throw new SessionException(e.getMessage());
		}
	}

	@Override
	public List<Session> addSession(Session s) throws SessionException {
		if(sessionRepository.existsById(s.getSessionId())) {
			throw new SessionException("Session with SessionID "+ s.getSessionId() +" already exists");
		}
		else {
			sessionRepository.save(s);
			return getAllSession();
		}
	}

	@Override
	public Session getSessionById(String id) throws SessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Session> deleteSession(String id) throws SessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Session> updateSession(Session s) throws SessionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Session> getSessionByMode(String mode) throws SessionException {
		// TODO Auto-generated method stub
		return null;
	}

}
