package com.vaannila.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tweet")
public class Tweet {
	private Long user_id;
	private String message;
	private Long tweet_id;
	private Date created;
	private String username;
	
	@Column(name="user")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@GeneratedValue
	@Column(name="created")
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	@Id
	@GeneratedValue
	@Column(name="tweet_id")
	public Long getTweet_id() {
		return tweet_id;
	}
	public void setTweet_id(Long tweet_id) {
		this.tweet_id = tweet_id;
	}

	@Column(name="user_id")
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Column(name="message")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

