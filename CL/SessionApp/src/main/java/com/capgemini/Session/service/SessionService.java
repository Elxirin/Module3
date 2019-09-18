package com.capgemini.Session.service;

import java.util.List;

import com.capgemini.Session.beans.Session;
import com.capgemini.Session.exceptions.SessionException;

public interface SessionService {
	
	List<Session> getAllSession() throws SessionException;
	List<Session> addSession(Session s) throws SessionException;
	Session getSessionById(String id) throws SessionException;
	List<Session> deleteSession(String id) throws SessionException;
	List<Session> updateSession(Session s) throws SessionException;
	List<Session> getSessionByMode(String mode) throws SessionException;
	
}
