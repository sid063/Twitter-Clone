package com.vaannila.web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vaannila.dao.TweetDAO;
import com.vaannila.dao.TweetDAOImpl;
import com.vaannila.dao.UserDAO;
import com.vaannila.dao.UserDAOImpl;
import com.vaannila.domain.Tweet;
import com.vaannila.domain.User;

public class TweetAction extends ActionSupport implements ModelDriven<Tweet> {

	User user = new User();
	Tweet tweet = new Tweet();
	private List<User> tweetList = new ArrayList<User>();
	private TweetDAOImpl tweetDAO = new TweetDAOImpl();
	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public Tweet getModel() {
		// TODO Auto-generated method stub
		return tweet;
	}
	
	public String putM()
	{
		System.out.println(tweet.getMessage());
		tweetDAO.saveTweet(tweet);
		return SUCCESS;
	}

	public List<User> getTweetList() {
		return tweetList;
	}

	public void setTweetList(List<User> tweetList) {
		this.tweetList = tweetList;
	}
}

