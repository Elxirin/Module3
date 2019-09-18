package com.capgemini.Session.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Session.beans.Session;
import com.capgemini.Session.exceptions.SessionException;
import com.capgemini.Session.service.SessionService;

@RestController
public class SessionController {

	@Autowired
	private SessionService sessionService;
	
	@RequestMapping("/sessions")
	public List<Session> getAllSessions() throws SessionException {
		return sessionService.getAllSession();
	}
	
	@PostMapping("/sessions")
	public List<Session> addSession(@RequestBody Session s) throws SessionException {
		return sessionService.addSession(s);
	}
	
}
