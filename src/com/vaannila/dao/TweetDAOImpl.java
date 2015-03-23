package com.vaannila.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.vaannila.domain.Tweet;
import com.vaannila.domain.User;

public class TweetDAOImpl implements TweetDAO{

	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction transaction;

	@Override
	public void saveTweet(Tweet tweet) {
		try {
			System.out.println("Update successful..");
			session.save(tweet);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} 

		
	}

	
}
