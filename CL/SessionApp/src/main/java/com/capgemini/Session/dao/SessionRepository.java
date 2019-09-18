package com.capgemini.Session.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Session.beans.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, String> {

}
